package com.example.jpa.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends CrudRepository<User, String>{

}
