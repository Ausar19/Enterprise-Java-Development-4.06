package EnterpriseJavaDevelopment406.repository;

import EnterpriseJavaDevelopment406.enums.EmployeeStatus;
import EnterpriseJavaDevelopment406.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

    List<Doctor> findByStatus(EmployeeStatus status);

    List<Doctor> findByDepartment(String department);

}
