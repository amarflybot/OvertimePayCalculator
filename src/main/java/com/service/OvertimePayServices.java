package com.service;

import com.factory.RuleEngine;
import com.model.Employee;

/**
 * Created by kumarao on 11-01-2016.
 */
public class OvertimePayServices {

    private RuleEngine ruleEngine;

    public void setRuleEngine(RuleEngine ruleEngine) {
        this.ruleEngine = ruleEngine;
    }

    public Double calculateRuleForEmployee(Employee employee){
        return ruleEngine.getRuleExecutionForEmployee(employee);
    }
}
