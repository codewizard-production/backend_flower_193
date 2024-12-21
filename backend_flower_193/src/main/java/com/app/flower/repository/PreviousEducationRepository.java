package com.app.flower.repository;

import com.app.flower.model.PreviousEducation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PreviousEducationRepository extends SimpleJpaRepository<PreviousEducation, String> {
    private final EntityManager em;
    public PreviousEducationRepository(EntityManager em) {
        super(PreviousEducation.class, em);
        this.em = em;
    }
    @Override
    public List<PreviousEducation> findAll() {
        return em.createNativeQuery("Select * from \"flower\".\"PreviousEducation\"", PreviousEducation.class).getResultList();
    }
}