package com.iit.framework_web.store;

import com.iit.framework_web.entities.Task;
import com.iit.framework_web.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "tasks", collectionResourceRel= "tasks")
public interface TaskRepository extends MongoRepository<Task, String> {
    @RestResource(path = "assigned")
    List<Task> findByAssignedToUuid(@Param("user") String user);
}
