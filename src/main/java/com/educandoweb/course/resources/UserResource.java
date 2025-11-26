package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    // para saber que é um resposta do tipo get do http:
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Pedro", "pedroreis@gmail.com", "51999645333", "7667");
        return ResponseEntity.ok().body(u); // retornando ok com corpo da resposta
    }

}
