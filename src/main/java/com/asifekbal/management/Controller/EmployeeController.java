package com.asifekbal.management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.asifekbal.management.Service.EmployeeServiceImplement;
import com.asifekbal.management.Shema.Employee;

@Controller
public class EmployeeController{

    @Autowired
    private EmployeeServiceImplement employeeServiceImplement;

    @GetMapping("/")
    public String viewHomePage(Model model) {

        model.addAttribute("allemplist", employeeServiceImplement.getEmployee());

        return "index";
    }

}
