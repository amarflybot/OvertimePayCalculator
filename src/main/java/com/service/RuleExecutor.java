package com.service;

import com.model.Employee;

/**
 * Created by kumarao on 11-01-2016.
 */
public abstract class RuleExecutor {
    //To be overridden depending Criteria
    public abstract Double overTimePayCalculator(Double overTimePay) ;
}
