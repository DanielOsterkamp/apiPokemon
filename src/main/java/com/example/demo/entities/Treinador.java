package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Treinador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;

    @OneToMany(mappedBy = "treinador")
    private List<Pokemon> pokemons;

    public Treinador(List<Pokemon> pokemons, UUID id, String nome) {
        this.pokemons = pokemons;
        this.id = id;
        this.nome = nome;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
