package com.model;

import java.util.Set;

/**
 * Created by amarendra on 09/01/16.
 */
public class Division {

    private String name;
    private Set<Rule> ruleSet;
    private Company company;

    public Division(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public Set<Rule> getRuleSet() {
        return ruleSet;
    }

    public void setRuleSet(Set<Rule> ruleSet) {
        this.ruleSet = ruleSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
