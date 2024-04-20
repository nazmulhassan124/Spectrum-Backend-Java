package com.java.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Model.Registration;
import com.java.Repository.RegistrationRepository;


@Service
public class RegistrationService {
	@Autowired
	RegistrationRepository registrationRepository;
	
	
	  public Registration save(Registration registration) {
	        if(!registration.equals(null)) {
	            return registrationRepository.save(registration);
	        }
	        return null;
	    }

	    public Registration getById(Integer id) {
	        Optional<Registration> optional = registrationRepository.findById(id);
	        if(optional.isPresent()) {
	            return optional.get();
	        }
	        return null;
	    }

	    public Registration update(Registration registration) {
	    	System.out.println(registration);
	        return registrationRepository.save(registration);
	    }

	    public String delete(Integer id) {
	        Optional<Registration> optional = registrationRepository.findById(id);
	        if(optional.isPresent()) {
	            registrationRepository.delete(optional.get());
	            return null;
	        }
	        return "fail";
	    }

	    public List<Registration> getAll() {

	        return registrationRepository.findAll();
	    }


	  


}
