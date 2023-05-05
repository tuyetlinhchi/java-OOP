package com.asifekbal.management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asifekbal.management.Repo.EmployeeRepository;
import com.asifekbal.management.Shema.Employee;

@Service
public class EmployeeServiceImplement implements EmployeeServices {

    @Autowired private EmployeeRepository empRepo;


    @Override
    public List<Employee> getEmployee()
    {
        return empRepo.findAll();
    }


}
