package com.devisv.school.service.repository;

import com.devisv.school.service.model.EmployeeHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface EmployerHistoryRepository extends CrudRepository<EmployeeHistory, Long> {

}
