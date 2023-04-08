package br.com.pabllo007.hroauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.pabllo007.hroauth.entities.User;

@Component
@FeignClient(name = "hr-user", path="/users") //name = "hr-user" = NOME DO MICROSERVIÇO QUE VAI COMUNICAR. path="/users" = Caminho especifico de comunicação
public interface UserFeignClient {

    @GetMapping(value = "/search")
    ResponseEntity<User> findByEmail(@RequestParam String email);

}
