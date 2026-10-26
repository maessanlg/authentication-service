package org.sample.devops.service.authentication.db;

public class User {
    private final String mail;
    private final String firstaname;
    private final String lastname;
    private final String password;

    public User(String mail, String firstaname, String lastname, String password) {
        this.mail = mail;
        this.firstaname = firstaname;
        this.lastname = lastname;
        this.password = password;
    }

    public String getFirstname() {
        return firstaname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }
}
