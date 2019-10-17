package com.exercice.alfresco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {


    FizzBuzzGame fizzBuzzGame;

    @GetMapping(value = "/from/{from}/to/{to}")
    public ResponseEntity<String> execute(@PathVariable int from, @PathVariable int to) {

        return new ResponseEntity<String>(fizzBuzzGame.execute(from, to), HttpStatus.OK);
    }

    @Autowired
    public void setFizzBuzzGame(FizzBuzzGame fizzBuzzGame) {
        this.fizzBuzzGame = fizzBuzzGame;
    }
}
