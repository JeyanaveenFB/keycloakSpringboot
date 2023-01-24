package com.example.keycloakByBaeldung.controller;

import com.example.keycloakByBaeldung.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String index() {
        return "external";
    }


    @GetMapping("/employees")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String customers(Principal principal, Model model) {

        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("username", "User123");
        return "employees";
    }
}
