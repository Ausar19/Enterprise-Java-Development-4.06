package EnterpriseJavaDevelopment406.controller;

import EnterpriseJavaDevelopment406.controller.dto.PatientDTO;
import EnterpriseJavaDevelopment406.repository.PatientRepository;
import EnterpriseJavaDevelopment406.enums.EmployeeStatus;
import EnterpriseJavaDevelopment406.model.Patient;
import EnterpriseJavaDevelopment406.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private IPatientService patientService;

    @GetMapping("/patients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @GetMapping("/patients/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Patient findById(@PathVariable Integer id) {
        return patientRepository.findById(id).get();
    }

    @GetMapping("/patients/between-date-of-birth")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findBetweenDateOfBirth(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end) {
        return patientRepository.findByDateOfBirthBetween(start, end);
    }

    @GetMapping("/patients/doctor-department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findByDoctorDepartment(@PathVariable String department) {
        return patientRepository.findByAdmittedByDepartment(department);
    }

    @GetMapping("/patients/off-doctor")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findByDoctorStatus() {
        return patientRepository.findByAdmittedByStatus(EmployeeStatus.OFF);
    }

    @PostMapping("/patients")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient store(@RequestBody @Valid PatientDTO patientDTO) throws ParseException {
        return patientService.store(patientDTO);
    }

    @PutMapping("/patients/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable int id, @RequestBody @Valid PatientDTO patientDTO) {
        patientService.update(id, patientDTO);
    }
}
