package com.docker.mysqltest.service;

import com.docker.mysqltest.model.TestTable;
import com.docker.mysqltest.repo.TestTableRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestTableService {

  @Autowired
  TestTableRepository tableRepository;

  public List<TestTable> findAll() {
    List<TestTable> list=tableRepository.findAll();
    return list;
  }
}
