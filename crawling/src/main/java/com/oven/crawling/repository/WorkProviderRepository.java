package com.oven.crawling.repository;

import com.oven.crawling.domain.WorkProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkProviderRepository extends JpaRepository<WorkProvider, Long> {
}
