//the repositary will interact with the database to save the data
package com.firsttest.employee.repository;

import com.firsttest.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositary extends JpaRepository<EmployeeEntity, Long> {//this jpa repositary is of type EmployeeEntity
}