package com.devisv.school.service.handler;

import com.devisv.school.service.model.Employee;
import com.devisv.school.service.model.EmployeeHistory;
import com.devisv.school.service.repository.EmployerHistoryRepository;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RepositoryEventHandler
public class EmployeeEventHandler {

  private final EmployerHistoryRepository employerHistoryRepository;

  public EmployeeEventHandler(EmployerHistoryRepository employerHistoryRepository) {
    this.employerHistoryRepository = employerHistoryRepository;
  }

  @Transactional
  @HandleAfterCreate
  public void handleEmployeeBeforeCreate(Employee employee){
    EmployeeHistory employeeHistory = new EmployeeHistory();
    employeeHistory.setComment("Was created");
    employeeHistory.setEmployee(employee);
    employerHistoryRepository.save(employeeHistory);
  }

}
