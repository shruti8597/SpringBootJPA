package com.example.socialsql.dbRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.socialsql.dbCollection.UserCollection;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserCollection,String> {
    public Optional<UserCollection> findById(String username);
}

