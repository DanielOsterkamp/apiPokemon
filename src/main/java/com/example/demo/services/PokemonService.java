package com.example.demo.services;

import com.example.demo.entities.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PokemonService {
    private final RestClient client;

    public PokemonService(){
        this.client = RestClient.builder().baseUrl("https://pokeapi.co/api/v2").build();
    }

    public String getPokemonByName(String name){
        return Objects.requireNonNull(client.get()
                .uri("/pokemon/{pokemon_name}", name)
                .retrieve()
                .body(Pokemon.class))
        .toString();
    }

    public String getPokemonById(String id){
        return Objects.requireNonNull(client.get()
                        .uri("/pokemon/{pokemon_id}", id)
                        .retrieve()
                        .body(Pokemon.class))
                .toString();
    }

    public ArrayList<String> getVariosPokemon(){
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 1; i <=50; i++){
            lista.add(getPokemonById(Integer.toString(i)));
        }
        return lista;
    }
}
