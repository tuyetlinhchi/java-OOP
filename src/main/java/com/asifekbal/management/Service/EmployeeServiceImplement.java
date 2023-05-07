package com.asifekbal.management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asifekbal.management.Repo.EmployeeRepository;
import com.asifekbal.management.Shema.Employee;

@Service
public class EmployeeServiceImplement implements EmployeeServices {

    @Autowired private EmployeeRepository employeeRepo;


    @Override
    public List<Employee> getEmployee()
    {
        return employeeRepo.findAll();
    }
    public void deleteEmployeeById(long Id) {
        this.employeeRepo.deleteById(Id);
    }

}
