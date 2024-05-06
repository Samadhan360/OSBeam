package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.EmployeeService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:9092")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService AdminService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee Employee)
    {
        Employee a=EmployeeService.addEmployee(Employee);
        return new ResponseEntity<>(a, HttpStatus.CREATED);
    }
//    @GetMapping("/get/{AdminId}")
//    public ResponseEntity<Admin> getAdmin(@PathVariable Long AdminId)
//    {
//        boolean isAdmin=AdminService.isAdminExists(AdminId);
//        if(isAdmin)
//        {
//            Admin a=AdminService.getAdminById(AdminId);
//            return new ResponseEntity<>(a,HttpStatus.OK);
//        }
//        else
//        {
//            System.out.print("No Admin found");
//            return null;
//        }
//    }
//    @GetMapping("/getAll")
//    public ResponseEntity<List<Admin>> getAllAdmin(){
//        return new ResponseEntity<>(AdminService.getAllAdmins(),HttpStatus.OK);
//    }
//    @PutMapping("/update/{AdminId}")
//    public ResponseEntity<Admin> updateAdmin(@PathVariable Long AdminId,@RequestBody Admin a)
//    {
//        boolean isAdmin=AdminService.isAdminExists(AdminId);
//        if(isAdmin)
//        {
//            return new ResponseEntity<>(AdminService.updateAdmin(AdminId, a),HttpStatus.OK);
//        }
//        else {
//            System.out.print("No Admin found");
//            return null;
//        }
//    }
//    @DeleteMapping("/delete/{AdminId}")
//    public void deleteAdminById(@PathVariable Long AdminId)
//    {
//        boolean isAdmin=AdminService.isAdminExists(AdminId);
//        if(isAdmin)
//        {
//            AdminService.deleteAdminById(AdminId);
//        }
//        else
//        {
//            System.out.print("No Admin found");
//        }
//    }
//    @DeleteMapping("/deleteAll")
//    public void deleteAllAdmin(){
//        AdminService.deleteAllAdmin();
//    }
}
