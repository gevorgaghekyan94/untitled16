package com.company;

public class CountryDoesNotExist extends RuntimeException {
    public CountryDoesNotExist(String message) {
        super(message);
    }
}
