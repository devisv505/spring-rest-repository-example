package com.devisv.school.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emploee_history", schema = "public")
public class EmployeeHistory {

  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String comment;

  @ManyToOne
  @JoinColumn(name = "emploee_id", nullable=false)
  private Employee employee;

  public EmployeeHistory() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
