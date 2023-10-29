package pro.sky.Streams.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.sky.Streams.service.EmployeeService;

@Component
public class FillEmployees implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {
        employeeService.add("Иванова", "Мария", 1000, 1);
        employeeService.add("Петрова", "Татьяна", 1100, 2);
        employeeService.add("Морозов", "Павел", 1200, 2);
        employeeService.add("Кузнецов", "Андрей", 1300, 3);
        employeeService.add("Деревянко", "Наталья", 1400, 3);
        employeeService.add("Хлынов", "Михаил", 1500, 3);
    }
}