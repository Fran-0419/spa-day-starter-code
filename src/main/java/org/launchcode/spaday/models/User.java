package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    private int id;
    private int nextId = 1;

    @NotBlank(message = "Username can’t be empty")
    @Size(min = 3, max = 12, message = "Username should be between 5 and 15 characters")
    private String username;

    @Email(message = "Email should have the format of a valid email address")
    private String email;

    @NotBlank(message = "Username can’t be empty")
    @Min(value = 6, message = "The password should be at least 6 characters long")
    private String password;



    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;

    }
    public User(){
        this.id = nextId;
        nextId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
