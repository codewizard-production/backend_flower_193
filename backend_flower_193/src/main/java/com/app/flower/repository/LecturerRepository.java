package com.app.flower.repository;

import com.app.flower.model.Lecturer;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class LecturerRepository extends SimpleJpaRepository<Lecturer, String> {
    private final EntityManager em;
    public LecturerRepository(EntityManager em) {
        super(Lecturer.class, em);
        this.em = em;
    }
    @Override
    public List<Lecturer> findAll() {
        return em.createNativeQuery("Select * from \"flower\".\"Lecturer\"", Lecturer.class).getResultList();
    }
}