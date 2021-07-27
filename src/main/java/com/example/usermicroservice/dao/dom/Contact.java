package com.example.usermicroservice.dao.dom;

/**
 * @author ajay - created on 27-Jul-2021
 */
public class Contact {

    private long contactId;
    private String mobileNumber;
    private String emailId;
    private long userId;

    public long getContactId() {
        return contactId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public long getUserId() {
        return userId;
    }
}
