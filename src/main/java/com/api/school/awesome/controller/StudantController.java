package com.api.school.awesome.controller;

import com.api.school.awesome.model.Studant;
import com.api.school.awesome.service.StudantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studants")
public class StudantController {

    @Autowired
    private StudantService studantService;

    @PostMapping
    public ResponseEntity<Studant> create(@RequestBody Studant studant) {
        return ResponseEntity.ok(studantService.create(studant));
    }

    @GetMapping
    public ResponseEntity<List<Studant>> listAll() {
        return ResponseEntity.ok(studantService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Studant> findById(@PathVariable Long id) {
        return ResponseEntity.ok(studantService.findById(id));
    }


//    @GetMapping("/{name}")
//    public ResponseEntity<List<Studant>> findByName(@PathVariable String name) {
//        return ResponseEntity.ok(studantService.findByName(name));
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Studant> update(@PathVariable Long id, @RequestBody Studant studant) {
        return ResponseEntity.ok(studantService.update(id, studant));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.studantService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
