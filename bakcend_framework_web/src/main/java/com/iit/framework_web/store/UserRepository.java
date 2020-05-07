package com.iit.framework_web.store;

import com.iit.framework_web.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "users", collectionResourceRel= "users")
public interface UserRepository extends MongoRepository<User, String> {
    @RestResource(path = "username")
    User findByUsername(@Param("username") String username);

    @RestResource(path = "usernameExists")
    boolean existsByUsername(@Param("username") String username);
}
