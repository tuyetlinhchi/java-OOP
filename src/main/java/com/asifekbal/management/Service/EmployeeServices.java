package com.asifekbal.management.Service;

import java.util.List;

import com.asifekbal.management.Shema.Employee;

public interface EmployeeServices {
    public List<Employee> getEmployee();
    void deleteEmployeeById(long Id);
}
