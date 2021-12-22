package com.github.rdx7777.userproduct.repository;

import com.github.rdx7777.userproduct.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
