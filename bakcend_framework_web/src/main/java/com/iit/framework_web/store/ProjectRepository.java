package com.iit.framework_web.store;

import com.iit.framework_web.entities.Project;
import com.iit.framework_web.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "projects")
public interface ProjectRepository extends MongoRepository<Project, String> {
}
