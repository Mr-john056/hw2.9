package pro.sky.Streams.service;

import pro.sky.Streams.model.Employee;

import java.util.Collection;
import java.util.Map;

public interface EmployeeService {

    Employee add(String firstName, String lastName, int salary, int department);

    Employee remove(String firstName, String lastName, int salary, int department);

    Employee find(String firstName, String lastName, int salary, int department);

    Collection<Employee> findAll();

    Collection<Object> maxSalary();

    Collection<Object> minSalary();
}