package pro.sky.Lib.service;

import pro.sky.Lib.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    public List<Employee> getAllByDepartment(int dep);

    public Map<Integer, List<Employee>> getAll(int dep);

    Map<Integer, List<Employee>> getAll();

    Employee getMaxSalary(int department);

    Employee getMinSalary(int department);
}
