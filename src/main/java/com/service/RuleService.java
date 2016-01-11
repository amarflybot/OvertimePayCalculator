package com.service;

import com.database.Database;
import com.model.Rule;

import java.util.List;

/**
 * Created by kumarao on 11-01-2016.
 */
public class RuleService {

    public List<Rule> getAllRules(){
        return (List<Rule>) Database.ruleMap.values();
    }
}
