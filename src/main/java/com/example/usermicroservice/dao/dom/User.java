package com.example.usermicroservice.dao.dom;

import java.util.List;

/**
 * @author ajay - created on 27-Jul-2021
 */
public class User {

    private long userId;
    private String name;
    private List<Contact> contacts;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
