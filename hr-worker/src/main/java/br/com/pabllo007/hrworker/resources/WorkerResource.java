package br.com.pabllo007.hrworker.resources;

import br.com.pabllo007.hrworker.entities.Worker;
import br.com.pabllo007.hrworker.repositories.WorkerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class) ;

	@Autowired
	private Environment env;
	
    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
    	/*
    	int x = 1;
    	if (x == 1) {
    		throw new RuntimeException("Erro forçado");
    	}
    	*/
    	
    	try {
    		Thread.sleep(3000L);	
    	} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	
    	logger.info("PORT = " + env.getProperty("local.server.port"));
        Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}
