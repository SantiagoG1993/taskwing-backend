package taskwing.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taskwing.task.dtos.ClientDTO;
import taskwing.task.models.Client;
import taskwing.task.repositories.ClientRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<ClientDTO> getClients(){
        List<ClientDTO> clients = clientRepository.findAll()
                .stream()
                .map(client -> new ClientDTO(client))
                .collect(Collectors.toList());
        return clients;
    }
}
