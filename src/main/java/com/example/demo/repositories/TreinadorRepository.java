package com.example.demo.repositories;

import com.example.demo.entities.Treinador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TreinadorRepository extends JpaRepository<Treinador, UUID> {
}
