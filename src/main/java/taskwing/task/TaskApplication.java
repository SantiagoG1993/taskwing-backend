package taskwing.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import taskwing.task.models.Client;
import taskwing.task.models.Color;
import taskwing.task.models.State;
import taskwing.task.models.Task;
import taskwing.task.repositories.ClientRepository;
import taskwing.task.repositories.TaskRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData (TaskRepository taskRepository, ClientRepository clientRepository){
		return (args ) ->{
			Client client1 = new Client("Santiago","Gamarra","santi@gmail.com","123",true);
			Task task1 = new Task("Pasear al perro","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now().plusDays(1), LocalTime.now(),Color.GREEN,true);
			Task task2 = new Task("Ir al supermercado","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now().plusDays(4), LocalTime.now(),Color.YELLOW,true);
			Task task3 = new Task("Pagar facturas","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now(), LocalTime.now(),Color.RED,true);
			Task task4 = new Task("Hacer ejercicio","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now(), LocalTime.now(),Color.ORANGE,true);
			Task task5 = new Task("Pasear al perro","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now().plusDays(1), LocalTime.now(),Color.RED,true);
			Task task6 = new Task("Ir al supermercad","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now().plusDays(1), LocalTime.now(),Color.YELLOW,true);
			Task task7 = new Task("Pasear al perro","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now(), LocalTime.now(),Color.YELLOW,true);
			Task task8 = new Task("Hacer ejercicio","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now(), LocalTime.now(),Color.GREEN,true);
			Task task9 = new Task("Pasear al perro","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now().plusDays(1), LocalTime.now(),Color.GREY,true);
			Task task10 = new Task("Ir al supermercad","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now(), LocalTime.now(),Color.YELLOW,true);
			Task task11 = new Task("Pagar facturas","llevar al perro al parque a las 13hs", State.PENDING, LocalDate.now(), LocalTime.now(),Color.ORANGE,true);

			client1.addTask(task1);
			client1.addTask(task2);
			client1.addTask(task3);
			client1.addTask(task4);
			client1.addTask(task5);
			client1.addTask(task6);
			client1.addTask(task7);
			client1.addTask(task8);
			client1.addTask(task9);
			client1.addTask(task10);
			client1.addTask(task11);

			clientRepository.save(client1);
			taskRepository.save(task1);
			taskRepository.save(task2);
			taskRepository.save(task3);
			taskRepository.save(task4);
			taskRepository.save(task5);
			taskRepository.save(task6);
			taskRepository.save(task7);
			taskRepository.save(task8);
			taskRepository.save(task9);
			taskRepository.save(task10);
			taskRepository.save(task11);

		};
	}



}
