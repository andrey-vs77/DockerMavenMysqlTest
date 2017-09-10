package com.docker.mysqltest;

import com.docker.mysqltest.model.TestTable;
import com.docker.mysqltest.repo.TestTableRepository;
import com.docker.mysqltest.service.TestTableService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlTestApplication  implements CommandLineRunner {

  @Autowired
  TestTableService tableService;

  public static void main(String[] args) throws IOException {
    SpringApplication.run(MysqlTestApplication.class, args);
  }

  public void findAll() {
    tableService.findAll().forEach(x -> System.out.println(x.getName()));
  }

  @Override
  public void run(String... strings) throws Exception {
    System.out.println("Hello Andrey");
    findAll();
    System.out.println("Buy Andrey");
  }
}
