package com.example.demo.repositories;

import com.example.demo.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface pokemonRepository extends JpaRepository<Pokemon, UUID> {
}
