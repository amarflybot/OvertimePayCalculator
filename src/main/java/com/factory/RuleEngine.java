package com.factory;

import com.model.Employee;
import com.rules.RuleExecutorFactory;

/**
 * Created by kumarao on 11-01-2016.
 */
public class RuleEngine {

    RuleExecutorFactory ruleExecutorFactory;

    public void setRuleExecutorFactory(RuleExecutorFactory ruleExecutorFactory) {
        this.ruleExecutorFactory = ruleExecutorFactory;
    }

    public Double getRuleExecutionForEmployee(Employee employee) {
        return ruleExecutorFactory.getOverTimePay(employee);
    }
}
