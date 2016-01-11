package com;

import com.database.Database;
import com.model.Company;
import com.model.Division;

import java.util.Scanner;

/**
 * Created by amarendra on 09/01/16.
 */
public class MainTest {

    public static void main(String[] args) {

        while(true) {
            System.out.println("1 for Enter New Organisation");
            System.out.println("2 for Enter New Division");
            System.out.println("3 for Enter New Employee");
            Scanner option = new Scanner(System.in);
            Company company = null;
            if ("1".equals(option.next())) {
                System.out.println("Enter New Organisation name");
                Scanner orgName = new Scanner(System.in);
                company = new Company();
                company.setName(orgName.next());
                Database.companyMap.put(company.getName(), company);
            } else if ("2".equals(option.next())) {
                System.out.println("Enter New division name fo company name: "+company.getName());
                Scanner div = new Scanner(System.in);
                Division division = new Division(div.next(), company);
                division.setName(div.next());
                Database.companyMap.put(company.getName(), company);
            }
        }
    }
}
