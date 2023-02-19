package com.backend.controller;



import com.backend.entities.Item;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);
    @GetMapping("/")
    public String testApi() {
        logger.debug("Test de connexion à l'API ");
        return "Server 1 !";
    }

    @PostMapping(path="/api/addfile", consumes= "application/json")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addfile(@RequestBody Item item) {
        logger.debug("nouveau fichier ajouté");
        System.out.println("{");
        System.out.println("nature : "+item.nature+",");
        System.out.println("content : "+item.content);
        System.out.println("}:");
    }
}
