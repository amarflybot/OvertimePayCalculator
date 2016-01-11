package com.service;

import com.factory.RuleFactory;
import com.model.Employee;
import com.model.Rule;

/**
 * Created by kumarao on 11-01-2016.
 */
public class OvertimePayServices {

    private RuleFactory ruleFactory;

    public void setRuleFactory(RuleFactory ruleFactory) {
        this.ruleFactory = ruleFactory;
    }

    public Double calculateRuleForEmployee(Employee employee){
        RuleExecutor ruleExecutor = ruleFactory.getRuleExecutorForEmployee(employee);
        return ruleExecutor.execute();
    }
}
