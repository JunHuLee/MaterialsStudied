package com.bootjpa.test.repository;

import com.bootjpa.test.entity.TestTableDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTableRepository extends JpaRepository<TestTableDto, String> {
}
