package com.example.demo.controllers;

import com.example.demo.services.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/apiPokemon")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @GetMapping("/getByNome/{nome}")
    public String getPokemonByName(@PathVariable String nome){
        return service.getPokemonByName(nome);
    }

    @GetMapping("/getById/{id}")
    public String getPokemonById(@PathVariable String id){
        return service.getPokemonById(id);
    }

    @GetMapping("/getVarios")
    public ArrayList<String> getVariosPokemon(){
        return service.getVariosPokemon();
    }
}
