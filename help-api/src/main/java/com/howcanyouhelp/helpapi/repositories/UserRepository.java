package com.howcanyouhelp.helpapi.repositories;

import com.howcanyouhelp.helpapi.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
