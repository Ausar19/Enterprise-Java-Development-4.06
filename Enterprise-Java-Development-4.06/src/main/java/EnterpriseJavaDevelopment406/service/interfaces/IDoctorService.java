package EnterpriseJavaDevelopment406.service.interfaces;

import EnterpriseJavaDevelopment406.controller.dto.DoctorDTO;
import EnterpriseJavaDevelopment406.controller.dto.DoctorDepartmentDTO;
import EnterpriseJavaDevelopment406.controller.dto.DoctorStatusDTO;
import EnterpriseJavaDevelopment406.enums.EmployeeStatus;
import EnterpriseJavaDevelopment406.model.Doctor;

import java.util.List;
import java.util.Optional;

public interface IDoctorService {
    Doctor store(DoctorDTO doctorDTO);

    void updateStatus(String id, DoctorStatusDTO doctorStatusDTO);

    void updateDepartment(String id, DoctorDepartmentDTO doctorDepartmentDTO);

    List<Doctor> search(Optional<EmployeeStatus> status, Optional<String> department);

    Doctor findById(String id);
}
