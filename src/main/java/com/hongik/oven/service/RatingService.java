package com.hongik.oven.service;

import com.hongik.oven.domain.User;
import com.hongik.oven.domain.Work;
import com.hongik.oven.repository.UserRepository;
import com.hongik.oven.repository.WorkRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RatingService {

   private final UserRepository userRepository;
   private final WorkRepository workRepository;

    public void writing() {

        String filePath = "/Users/siyoung/Rating.csv";

        File file = null;
        BufferedWriter bw = null;
        String NEWLINE = System.lineSeparator();

        try {
            Random random = new Random();
            List<User> users = userRepository.findAll();
            file = new File(filePath);
            bw = new BufferedWriter(new FileWriter(file));

            bw.write("user_id, work_id, rating");
            bw.write(NEWLINE);

            for (int i = 0; i < users.size(); i++) {
                List<Work> randomWorks = workRepository.findRandoms();
                String userIdStr = String.valueOf(users.get(i).getId());
                for (int j = 0; j < randomWorks.size(); j++) {
                    String wordIdStr = String.valueOf(randomWorks.get(j).getId());
                    String rating = String.valueOf(random.nextInt(4)+2);
                    String totalstr = userIdStr + "," + wordIdStr + "," + rating;
                    bw.write(totalstr);
                    bw.write("\n");
                }
            }

            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
