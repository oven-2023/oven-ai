package com.hongik.oven.repository;

import com.hongik.oven.domain.Work;
import org.hibernate.jdbc.WorkExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {

    @Query(value = "SELECT * FROM oven.work order by RAND() limit 4",nativeQuery = true)
    List<Work> findRandoms();

}
