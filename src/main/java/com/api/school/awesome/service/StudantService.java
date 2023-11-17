package com.api.school.awesome.service;

import com.api.school.awesome.model.Studant;
import com.api.school.awesome.repository.StudantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudantService {
    @Autowired
    private StudantRepository studantRepository;

    public Studant create(Studant studant) {
        return studantRepository.save(studant);
    }

    public List<Studant> findAll(){
        return studantRepository.findAll();
    }

    public Studant findById(Long id) {
        return studantRepository.findById(id).orElseThrow(() -> new RuntimeException("Studant not found"));
    }

    public List<Studant> findByName(String name) {
        return studantRepository.findByNameIgnoreCaseContaining(name);
    }

    public Studant update(Long id, Studant studant) {
       Studant studantUpdate = findById(id);
       studantUpdate.setName(studant.getName());
       return studantRepository.save(studantUpdate);
    }

    public void delete(Long id) {
        this.findById(id);
        studantRepository.deleteById(id);
    }


}
