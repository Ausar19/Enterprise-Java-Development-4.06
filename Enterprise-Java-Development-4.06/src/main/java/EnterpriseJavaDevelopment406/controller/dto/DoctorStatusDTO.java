package EnterpriseJavaDevelopment406.controller.dto;

import EnterpriseJavaDevelopment406.enums.EmployeeStatus;

import javax.validation.constraints.NotEmpty;

public class DoctorStatusDTO {
    @NotEmpty(message = "Status can't be empty or null.")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeeStatus getEmployeeStatus() {
        return EmployeeStatus.valueOf(status);
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.status = employeeStatus.toString();
    }
}
