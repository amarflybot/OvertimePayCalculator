package com.model;

/**
 * Created by amarendra on 09/01/16.
 */
public class Employee {

    private String name;
    private Double workingHour;
    private Double overtimePay;
    private Double carAllowance;
    private Integer employeeType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(Double workingHour) {
        this.workingHour = workingHour;
    }

    public Double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(Double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public Double getCarAllowance() {
        return carAllowance;
    }

    public void setCarAllowance(Double carAllowance) {
        this.carAllowance = carAllowance;
    }

    public Integer getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
    }
}
