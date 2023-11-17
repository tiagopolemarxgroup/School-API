package com.api.school.awesome.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_studant")
public class Studant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Studant() {
    }

    public Studant(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studant studant = (Studant) o;
        return Objects.equals(id, studant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
