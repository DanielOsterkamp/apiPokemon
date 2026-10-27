package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
public class Pokemon{

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Setter
    @Getter
    private double height;
    @ManyToOne
    @JoinColumn(name = "treinador_id")
    private Treinador treinador;

    public Pokemon(String name, UUID id, double height,Treinador treinador) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.treinador = treinador;
    }


    @Override
    public String toString() {
        return "com.example.apirestwithspring.entities.Pokemon: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
