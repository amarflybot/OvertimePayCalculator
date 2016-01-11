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
        RuleExecutor rule = null;
        if (employee.getEmployeeType().equals(1)) {
            // For Permanent Employee
            if (employee.getDivision().getCompany().getName().equals("CompanyA")) {
                List<Rule> allRules = ruleService.getAllRules();
                for(Rule rule1 : allRules){
                    if(employee.getOvertimePay() > rule1.getStartWorkingHour() && employee.getOvertimePay() <= rule1.getEndWorkingHour()){
                        rule = new RuleExecutor() {
                            public Double execute() {
                                System.out.println("In CompanyA, EmployeeType is 1");
                                return 0d;
                            }
                        };
                    }
                }

                //Conditions for a rule
                // How to execute it.
            }
        }

        return rule;
    }
}
