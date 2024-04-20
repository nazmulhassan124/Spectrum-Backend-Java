package com.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

}
