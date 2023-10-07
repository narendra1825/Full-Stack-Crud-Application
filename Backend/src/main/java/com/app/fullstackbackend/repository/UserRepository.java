package com.app.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.fullstackbackend.model.User1;

public interface UserRepository extends JpaRepository<User1,Long> {
}