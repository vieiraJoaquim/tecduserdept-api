package com.tecd.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecd.userdept.entities.User;

public interface UserRopository extends JpaRepository<User, Long> {

}
