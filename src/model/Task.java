package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
    private int id;
    private String description;
    private TaskStatus status;
    private String title;
    private LocalDateTime creationDate;


    public Task(int id, String description, String title, LocalDateTime creationDate, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.creationDate = creationDate;
        this.status = status;
        this.title = title;
    }


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Task {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", creationDate=" + creationDate +
                '}';
    }
}
