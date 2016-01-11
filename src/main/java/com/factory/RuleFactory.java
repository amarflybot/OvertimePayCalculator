package com.factory;

import com.model.Employee;
import com.model.Rule;
import com.service.RuleExecutor;
import com.service.RuleService;

import java.util.List;

/**
 * Created by kumarao on 11-01-2016.
 */
public class RuleFactory {

    RuleService ruleService;

    public void setRuleService(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    public RuleExecutor getRuleExecutorForEmployee(Employee employee) {
        //Get Rule for Employee
        RuleExecutor ruleExecutor = null;
        List<Rule> allRules = ruleService.getAllRules();
        for(final Rule rule1 : allRules){
        if (employee.getEmployeeType().equals(rule1.getEmployeeType())) {
            // For Permanent Employee
            if (employee.getDivision().getCompany().getName().equals(rule1.getCompany().getName())) {
                    if(employee.getOvertimePay() > rule1.getStartWorkingHour() && employee.getOvertimePay() <= rule1.getEndWorkingHour()){
                        ruleExecutor = new RuleExecutor() {
                            public Double execute() {
                                System.out.println("In "+rule1.getCompany().getName()+" EmployeeType is "+rule1.getEmployeeType());
                                return 0d;
                            }
                        };
                    }
                }

                //Conditions for a ruleExecutor
                // How to execute it.
            }
        }

        return ruleExecutor;
    }
}
