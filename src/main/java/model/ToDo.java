package model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

public class ToDo {

    @Id
    @GeneratedValue
    private int id;
    private String description;
    private Timestamp createdTime;
    private Timestamp modifiedTime;
    private boolean completed;

    public ToDo() {
    }

    public ToDo(int id, String description, Timestamp createdTime, Timestamp modifiedTime, boolean completed) {
        this.id = id;
        this.description = description;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedTime=" + modifiedTime +
                ", completed=" + completed +
                '}';
    }
}
