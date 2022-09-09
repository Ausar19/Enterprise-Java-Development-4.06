package EnterpriseJavaDevelopment406.service.interfaces;

import EnterpriseJavaDevelopment406.controller.dto.PatientDTO;
import EnterpriseJavaDevelopment406.model.Patient;

import java.text.ParseException;

public interface IPatientService {
    Patient store(PatientDTO patientDTO) throws ParseException;

    void update(int id, PatientDTO patientDTO);
}
