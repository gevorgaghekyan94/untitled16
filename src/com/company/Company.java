package com.company;

public class Company {

    private String name;
    private String country;
    private int quantityOfEmpolyees;

    public Company() {
    }

    public Company(String name, String country, int quantityOfEmpolyees) {
        this.name = name;
        this.country = country;
        this.quantityOfEmpolyees = quantityOfEmpolyees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getQuantityOfEmpolyees() {
        return quantityOfEmpolyees;
    }

    public void setQuantityOfEmpolyees(int quantityOfEmpolyees) {
        this.quantityOfEmpolyees = quantityOfEmpolyees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (quantityOfEmpolyees != company.quantityOfEmpolyees) return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;
        return country != null ? country.equals(company.country) : company.country == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + quantityOfEmpolyees;
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", quantityOfEmpolyees=" + quantityOfEmpolyees +
                '}';
    }
}
