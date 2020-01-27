package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class YellowPages {

    private ArrayList<Company> companies;
//    private HashMap<String,ArrayList<Company>> companiesByCountry;
    Scanner scanner = new Scanner(System.in);
    public YellowPages() {
        this.companies = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Insert : " + (i + 1) + " := Company Name, Country, number of employees" + "\n");
            try {
                this.companies.add(new Company(scanner.next(),scanner.next(),scanner.nextInt()));
            } catch (InputMismatchException e) {
                System.out.println("Not added company");
            }
        }
    }

    public YellowPages(ArrayList<Company> companies) {
        this.companies = companies;
    }

    public ArrayList<Company> getCompaniesByCountry(String country) {
        HashMap<String,ArrayList<Company>> countryCompanies = new HashMap<>();
        ArrayList<Company> companies1 = new ArrayList<>();
        for (int i = 0; i < this.companies.size(); i++) {
            if (countryCompanies.containsKey(this.companies.get(i).getCountry())) {
                countryCompanies.get(this.companies.get(i).getCountry()).add(this.companies.get(i));
            } else {
                ArrayList<Company> companyArrayList = new ArrayList<>();
                companyArrayList.add(this.companies.get(i));
                countryCompanies.put(this.companies.get(i).getCountry(),companyArrayList);
            }
        }
        if (countryCompanies.containsKey(country)) {
            companies1 = countryCompanies.get(country);
        } else {
            throw new CountryDoesNotExist("Idi v");
        }
        return companies1;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YellowPages that = (YellowPages) o;

        return companies != null ? companies.equals(that.companies) : that.companies == null;
    }

    @Override
    public int hashCode() {
        return companies != null ? companies.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "YellowPages{" +
                "companies=" + companies +
                '}';
    }
}
