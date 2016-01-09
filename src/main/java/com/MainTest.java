package com;

import com.database.Database;
import com.model.Company;

import java.util.Scanner;

/**
 * Created by amarendra on 09/01/16.
 */
public class MainTest {

    public static void main(String[] args) {

        while(true){
            System.out.println("1 for Enter New Organisation");
            System.out.println("2 for Enter New Division");
            System.out.println("3 for Enter New Employee");
            Scanner option = new Scanner(System.in);
            if("1".equals(option.next())){
                Scanner orgName = new Scanner(System.in);
                Company company = new Company();
                company.setName(orgName.next());
                Database.companyMap.put(company.getName(), company);
            }
        }
    }
}
