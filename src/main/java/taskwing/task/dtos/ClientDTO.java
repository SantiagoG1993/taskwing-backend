package taskwing.task.dtos;
import taskwing.task.models.Client;
import taskwing.task.models.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientDTO {

    private Long id;
    private String name,surname,email,password;
    private Boolean isAdmin;
    private List<TaskDTO> taskList = new ArrayList<>();



    public ClientDTO() {
    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.surname = client.getSurname();
        this.email = client.getEmail();
        this.password = client.getPassword();
        this.isAdmin = client.getAdmin();
        this.taskList =client.getTaskList()
                .stream().map(task -> new TaskDTO(task))
                .collect(Collectors.toList());
    }

    public List<TaskDTO> getTaskList() {
        return taskList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
