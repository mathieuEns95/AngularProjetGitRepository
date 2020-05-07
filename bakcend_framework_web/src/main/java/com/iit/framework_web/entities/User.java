package com.iit.framework_web.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Document
@Valid
public class User {
    @Id
    private String uuid;

    @NotBlank(message = "username: required") @Length(min = 3, message = "username : trop court")
    @Indexed(unique = true)
    private String username;

    @NotBlank(message = "password: required") @Length(min = 8, message = "password trop court")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotBlank(message = "firstName: required") @Length(min = 3, message = "firstName : nom trop court")
    private String firstName;

    @NotBlank(message = "lastname: required") @Length(min = 3, message = "lastname : nom trop court")
    private String lastName;

    @NotBlank(message = "email: required") @Length(min = 4, message = "email : nom trop court")
    private String email;

    private UserRole role;

    public User(
            @NotBlank(message = "username: required") @Length(min = 3, message = "username : trop court") String username,
            @NotBlank(message = "password: required") @Length(min = 8, message = "password trop court") String password,
            @NotBlank(message = "firstName: required") @Length(min = 3, message = "firstName : nom trop court") String firstName,
            @NotBlank(message = "lastname: required") @Length(min = 3, message = "lastname : nom trop court") String lastName,
            @NotBlank(message = "email: required") @Length(min = 4, message = "email : nom trop court") String email,
            UserRole role) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        if(this.role == null) {
            this.role = UserRole.DEVELOPER;
        }
    }

    public User() {
        this.role = UserRole.DEVELOPER;
    }

    public String getid() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public enum UserRole {
        ADMIN,
        PROJECT_MANAGER,
        DEVELOPER
    }
}
