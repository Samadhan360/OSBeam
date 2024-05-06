package serviceImplementation;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;
import services.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository EmployeeRepo;

    @Override
    public Employee addEmployee(Employee Employee) {
        return EmployeeRepo.save(Employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee addAdmin(Employee Employee) {
        return null;
    }

    @Override
    public List<Employee> getAllAdmins() {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return EmployeeRepo.findAll();
    }

    @Override
    public Employee getAdminById(Long EmployeeId) {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long AdminId) {
        return null;
    }






    @Override
    public Employee updateEmployee(Long AdminId, Employee Admin) {
        Employee a=EmployeeRepo.findById(AdminId).get();
        a.setName(Admin.getName());
        a.setUsername(Admin.getUsername());
        a.setPassword(Admin.getPassword());
        a.setEmail(Admin.getEmail());
        a.setMobilenumber(Admin.getMobilenumber());
        return EmployeeRepo.save(a);
    }


    @Override
    public void deleteEmployeeById(Long AdminId) {
        Long EmployeeId = null;
        EmployeeRepo.deleteById(EmployeeId);
    }



    @Override
    public void deleteAllEmployee() {
        EmployeeRepo.deleteAll();

    }

    @Override
    public boolean isAdminExists(Long AdminId) {
        return false;
    }


}
