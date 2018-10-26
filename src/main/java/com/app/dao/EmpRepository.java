package com.app.dao;

import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;
@Repository
public interface EmpRepository extends MongoRepository<Employee,Integer>  
{

}
