package br.com.pabllo007.hruser.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pabllo007.hruser.entities.User;
import br.com.pabllo007.hruser.repositories.UserRepository;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	private static Logger logger = LoggerFactory.getLogger(UserResource.class) ;

    @Autowired
    private UserRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {

        User obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {

        User obj = repository.findByEmail(email);
        return ResponseEntity.ok(obj);
    }

}
