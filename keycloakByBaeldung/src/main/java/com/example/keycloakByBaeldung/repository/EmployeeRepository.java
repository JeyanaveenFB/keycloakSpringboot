package com.example.keycloakByBaeldung.repository;

import com.example.keycloakByBaeldung.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
