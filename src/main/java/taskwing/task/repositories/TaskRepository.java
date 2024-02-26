package taskwing.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taskwing.task.models.State;
import taskwing.task.models.Task;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task,Long> {


}
