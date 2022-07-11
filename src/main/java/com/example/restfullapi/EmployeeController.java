package com.example.restfullapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    /**
     * Employee Daten aus external api Quelle in list packen
     * die liste
     */

    @Value("${employee.url}")
    private String employee;
    @GetMapping("/employee")
    public List<Object> getEmployees(){
        RestTemplate restTemplate = new RestTemplate();
        Object[] employees = restTemplate.getForObject(employee,Object[].class);

        return Arrays.asList(employees);
    }


    /**
     *
     */
    @Value("${countries.url}")
    private String country;
    @GetMapping("/country")
    public List<Object> getCountries(){
        RestTemplate restTemplate = new RestTemplate();
        Object[] countries = restTemplate.getForObject(country,Object[].class);

        return Arrays.asList(countries);
    }
}
