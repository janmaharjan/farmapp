/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.aut.repository;

import com.cibt.web.aut.entity.Role;
import com.cibt.web.aut.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Maharjan
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUserName(String username);
    User findByEmail(String email);
}
