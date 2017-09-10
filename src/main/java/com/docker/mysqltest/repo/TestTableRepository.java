package com.docker.mysqltest.repo;

import com.docker.mysqltest.model.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestTableRepository extends JpaRepository<TestTable, Integer> {

}
