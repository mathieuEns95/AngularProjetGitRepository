package com.iit.framework_web.entities;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Document
public class Task {
    @Id
    private String uuid;

    @DBRef
    @NotNull
    private Project project;

    @DBRef
    private User assignedTo;

    private Status status = Status.TODO;

    @NotBlank(message = "title: required") @Length(min = 3, message = "title : trop court")
    private String title;

    private String description;

    private List<String> files;

    private long estimation;

    private long workedIn;

    public String getUuid() {
        return uuid;
    }

    public String getid() {
        return uuid;
    }
    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getEstimation() {
        return estimation;
    }

    public void setEstimation(long estimation) {
        this.estimation = estimation;
    }

    public long getWorkedIn() {
        return workedIn;
    }

    public void setWorkedIn(long workedIn) {
        this.workedIn = workedIn;
    }

    public enum Status {
        TODO,
        IN_PROGRESS,
        FINISHED
    }
}
