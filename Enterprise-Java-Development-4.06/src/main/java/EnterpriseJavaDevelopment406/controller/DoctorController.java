package EnterpriseJavaDevelopment406.controller;

import EnterpriseJavaDevelopment406.controller.dto.DoctorDTO;
import EnterpriseJavaDevelopment406.controller.dto.DoctorDepartmentDTO;
import EnterpriseJavaDevelopment406.controller.dto.DoctorStatusDTO;
import EnterpriseJavaDevelopment406.enums.EmployeeStatus;
import EnterpriseJavaDevelopment406.model.Doctor;
import EnterpriseJavaDevelopment406.service.interfaces.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {


    @Autowired
    private IDoctorService doctorService;

    @GetMapping("/doctors")
    @ResponseStatus(HttpStatus.OK)
    public List<Doctor> search(@RequestParam Optional<EmployeeStatus> status, @RequestParam Optional<String> department) {
        return doctorService.search(status, department);
    }

    @GetMapping("/doctors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Doctor findById(@PathVariable String id) {
        return doctorService.findById(id);
    }

    @PostMapping("/doctors")
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor store(@RequestBody @Valid DoctorDTO doctorDTO) {
        return doctorService.store(doctorDTO);
    }

    @PatchMapping("/doctors/{id}/status")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStatus(@PathVariable String id, @RequestBody @Valid DoctorStatusDTO doctorStatusDTO) {
        doctorService.updateStatus(id, doctorStatusDTO);
    }

    @PatchMapping("/doctors/{id}/department")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDepartment(@PathVariable String id, @RequestBody @Valid DoctorDepartmentDTO doctorDepartmentDTO) {
        doctorService.updateDepartment(id, doctorDepartmentDTO);
    }

}
