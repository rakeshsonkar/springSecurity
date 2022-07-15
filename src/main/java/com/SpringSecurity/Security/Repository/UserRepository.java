package com.SpringSecurity.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecurity.Security.Model.User;

public interface UserRepository extends JpaRepository<User,String>{

}
