package com.hongik.oven.repository;

import com.hongik.oven.domain.WorkProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkProviderRepository extends JpaRepository<WorkProvider, Long> {
}
