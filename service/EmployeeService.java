package pro.sky.Lib.service;

import pro.sky.Lib.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee maxSalary(String firstName, String lastName, int salary, int department);

    Employee minSalary(String firstName, String lastName, int salary, int department);

    Employee add(String firstName, String lastName, int salary, int department);

    Employee remove(String firstName, String lastName, int salary, int department);

    Employee find(String firstName, String lastName, int salary, int department);

    Collection<Employee> findAll();

    Collection<Employee> maxSalary();

    Collection<Employee> minSalary();
}