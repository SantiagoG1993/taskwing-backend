package taskwing.task.dtos;

import jakarta.persistence.*;
import taskwing.task.models.Client;
import taskwing.task.models.Color;
import taskwing.task.models.State;
import taskwing.task.models.Task;

import java.time.LocalDate;
import java.time.LocalTime;

public class TaskDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskName,description;
    private State state;
    private LocalDate date;
    private LocalTime time;
    private Color color;
    private Boolean isDeleted;

    public TaskDTO() {
    }

    public TaskDTO(Task task) {
        this.id = task.getId();
        this.taskName = task.getTaskName();
        this.description = task.getDescription();
        this.state = task.getState();
        this.date = task.getDate();
        this.time = task.getTime();
        this.color = task.getColor();
        this.isDeleted = task.getDeleted();
    }

    public Long getId() {
        return id;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
