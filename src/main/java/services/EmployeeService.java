package services;

import entity.Employee;

import java.util.List;

public interface EmployeeService {
   // Admin addAdmin(Admin Admin);
   static Employee  addEmployee(Employee Employee);

    List<Employee> getAllEmployees();

    Employee addAdmin(Employee Employee);

    List<Employee> getAllAdmins();

    List<Employee> getAllEmployee();

    Employee getAdminById(Long EmployeeId);

    Employee getEmployeeById(Long EmployeeId);

    Employee updateEmployee(Long AdminId, Employee Employee);

    void deleteEmployeeById(Long EmployeeId);

    void deleteAllEmployee();

    boolean isAdminExists(Long EmployeeId);
}
