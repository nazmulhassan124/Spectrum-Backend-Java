package com.java.Controller;

import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Model.Registration;
import com.java.Service.RegistrationService;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class RegistrationController {
	
	@Autowired
	RegistrationService regService;
	


    @PostMapping("/save")
    public Registration post(@RequestBody Registration reg) {

        return regService.save(reg);
    }


    @GetMapping("/get/{id}")
    public Registration get(@PathVariable Integer id) {

        return regService.getById(id);
    }

    @PutMapping("/update")
    public Registration update(@RequestBody Registration Registration) {

        return regService.update(Registration);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        return regService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Registration> getAll() {
        return regService.getAll();
    }

   


}
