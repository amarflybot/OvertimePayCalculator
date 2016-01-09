package com.database;

import com.model.Company;
import com.model.Division;
import com.model.Employee;
import com.model.Rule;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amarendra on 09/01/16.
 */
public class Database {

    public static Map<String, Employee> employeeMap = new HashMap();
    public static Map<String, Company> companyMap = new HashMap();
    public static Map<String, Division> divisionMap = new HashMap();
    public static Map<String, Rule> ruleMap = new HashMap();


}
