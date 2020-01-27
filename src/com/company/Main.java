package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Company company1 = new Company("Ucom","Armenia",5000);
//        Company company2 = new Company("Rostelekom","Russia",4000);
//        Company company3 = new Company("Sil","Armenia",3000);
//        Company company4 = new Company("BetConstruct","Armenia",2000);
//        Company company5 = new Company("Synopsis","Usa",1000);
//        Company company6 = new Company("Bulki","Russia",1000);
//        ArrayList<Company> companies = new ArrayList<>();
//        companies.add(company1);
//        companies.add(company2);
//        companies.add(company3);
//        companies.add(company4);
//        companies.add(company5);
//        companies.add(company6);
        Scanner scanner = new Scanner(System.in);
        YellowPages yellowPages = new YellowPages();
        System.out.println(yellowPages.getCompaniesByCountry(scanner.nextLine()));

    }
}
