package pro.sky.Lib.service;

import org.springframework.stereotype.Service;
import pro.sky.Lib.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeServiceImpl employeeServiceImpl;


    public DepartmentServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    public List<Employee> getAllByDepartment(int dep) {
        return employeeServiceImpl.findAll()
                .stream()
                .filter(employee -> employee.getDepartment() == dep)
                .collect(Collectors.toList());
    }

    public Map<String, Employee> employees;

    @Override
    public Map<Integer, List<Employee>> getAll(int dep) {
        return null;
    }
    @Override
    public Employee getMaxSalary(int dep) {
        return employeeServiceImpl.getEmployees().values()
                .stream()
                .filter(employee -> employee.getDepartment() == dep)
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(pro.sky.Lib.exception.EmployeeNotFoundException::new);
    }
    @Override
    public Employee getMinSalary(int dep) {
        return employeeServiceImpl.getEmployees().values()
                .stream()
                .filter(employee -> employee.getDepartment() == dep)
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(pro.sky.Lib.exception.EmployeeNotFoundException::new);
    }

    @Override
    public Map<Integer, List<Employee>> getAll() {
        return employeeServiceImpl.findAll()
                .stream().collect(Collectors.groupingBy(Employee::getDepartment));

    }

}