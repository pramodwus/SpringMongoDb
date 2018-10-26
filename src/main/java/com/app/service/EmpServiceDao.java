package com.app.service;

import java.util.List;

import com.app.entity.Employee;

public interface EmpServiceDao 
{
public boolean AddEmp(Employee e);
public boolean DeleteEmp(int a);
public boolean UpdateEmp(Employee e);
public List<Employee> AllEmp();
}
