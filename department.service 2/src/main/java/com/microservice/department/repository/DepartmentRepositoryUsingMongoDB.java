package com.microservice.department.repository;


import com.microservice.department.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryUsingMongoDB extends MongoRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}
