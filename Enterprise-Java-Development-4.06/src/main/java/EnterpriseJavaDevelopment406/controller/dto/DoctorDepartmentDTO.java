package EnterpriseJavaDevelopment406.controller.dto;

import javax.validation.constraints.NotEmpty;

public class DoctorDepartmentDTO {
    @NotEmpty(message = "Department can't be empty or null.")
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
