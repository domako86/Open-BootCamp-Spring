package com.example.obspringdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository -- le pasamos la clase (Coche) y el tipo de la clave primaria (Long)
@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
}
