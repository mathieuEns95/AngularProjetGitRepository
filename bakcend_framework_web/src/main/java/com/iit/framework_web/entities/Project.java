package com.iit.framework_web.entities;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Document
public class Project {
    @Id
    private String uuid;

    @NotBlank(message = "title: required") @Length(min = 3, message = "title : trop court")
    private String title;

    @DBRef
    private List<Task> tasks = new ArrayList<>();

    private String description;

    @DBRef
    private User manager;

    @DBRef
    private Collection<User> developers = new ArrayList<>();

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public Collection<User> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Collection<User> developers) {
        this.developers = developers;
    }
}
