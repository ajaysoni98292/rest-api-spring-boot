package com.example.usermicroservice.dao.dom;

/**
 * @author ajay - created on 27-Jul-2021
 */
public class Contact {

    private String mobileNumber;
    private String city;
    private String country;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
