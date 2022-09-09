package EnterpriseJavaDevelopment406.controller.dto;

import EnterpriseJavaDevelopment406.enums.EmployeeStatus;

import javax.validation.constraints.NotEmpty;

public class DoctorDTO {
    @NotEmpty(message = "Employee can't be empty or null.")
    private String employeeId;
    @NotEmpty(message = "Name can't be empty or null.")
    private String name;
    @NotEmpty(message = "Department can't be empty or null.")
    private String department;
    @NotEmpty(message = "Status can't be empty or null.")
    private String status;

    public DoctorDTO() {
    }

    public DoctorDTO(String employeeId, String name, String department, EmployeeStatus employeeStatus) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.status = employeeStatus.toString();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
