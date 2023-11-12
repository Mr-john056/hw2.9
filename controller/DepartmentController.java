package pro.sky.Lib.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Lib.model.Employee;
import pro.sky.Lib.service.DepartmentService;

@RestController
@RequestMapping("/dep")
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllByDep(@RequestParam(required = false) Integer dep) {
        return dep == null ?
                ResponseEntity.ok(service.getAll())
                :
                ResponseEntity.ok(service.getAllByDepartment(dep));
    }

    @GetMapping("/max-salary")
    public Employee getMaxSalary(@RequestParam int department) {
        return service.getMaxSalary(department);
    }

    @GetMapping("/min-salary")
    public Employee getMinSalary(@RequestParam int department) {
        return service.getMinSalary(department);
    }
}