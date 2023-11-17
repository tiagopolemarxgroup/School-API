package com.api.school.awesome.repository;

import com.api.school.awesome.model.Studant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudantRepository extends JpaRepository<Studant, Long> {
    List<Studant> findByNameIgnoreCaseContaining(String name);
}
