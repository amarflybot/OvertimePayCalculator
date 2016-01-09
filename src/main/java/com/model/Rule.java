package com.model;

/**
 * Created by amarendra on 09/01/16.
 */
public class Rule {

    private Company company;
    private Division division;
    private Double startWorkingHour;
    private Double endWorkingHour;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Double getStartWorkingHour() {
        return startWorkingHour;
    }

    public void setStartWorkingHour(Double startWorkingHour) {
        this.startWorkingHour = startWorkingHour;
    }

    public Double getEndWorkingHour() {
        return endWorkingHour;
    }

    public void setEndWorkingHour(Double endWorkingHour) {
        this.endWorkingHour = endWorkingHour;
    }
}
