package com.example.obprueba;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepo extends JpaRepository<Coche,Long> {
}
