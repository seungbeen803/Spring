package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// MyDatabaseService.java
@Service
public class MyDatabaseService {
    // 여기에는 어떤 Bean을 주입시켜줘야 하는지??
    @Autowired
    @Qualifier("simpleCrudRepositoryImpl")
    CrudRepository repository;
}
