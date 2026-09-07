package com.company;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id) ;
}
