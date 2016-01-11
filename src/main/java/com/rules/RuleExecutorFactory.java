package com.rules;

import com.model.Employee;

/**
 * Created by kumarao on 11-01-2016.
 */
public class RuleExecutorFactory {

    private String companyName1 = "Company1";
    private String employeeType1 = "1";
    private Double startWeeklyWorkingHour1 = 0d;
    private Double endWeeklyWorkingHour1 = 40d;
    private Double endWeeklyWorkingHour2 = 60d;

    public Double getOverTimePay(Employee employee) {
        if(employee.getDivision().getCompany().getName().equals(companyName1)){
            if(employee.getEmployeeType().equals(employeeType1)){
                if(employee.getWorkingHour()> startWeeklyWorkingHour1 )

                    if(employee.getWorkingHour()< endWeeklyWorkingHour1){
                    //Select Calculator
                    return new RuleExecutor1().overTimePayCalculator(employee.getOvertimePay());
                }else if(employee.getWorkingHour()< endWeeklyWorkingHour2){
                        //Select Calculator
                        return new RuleExecutor2().overTimePayCalculator(employee.getOvertimePay());
                    }
            }

        }
        return null;
    }
}
