package com.app.flower.repository;

import com.app.flower.model.Department;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DepartmentRepository extends SimpleJpaRepository<Department, String> {
    private final EntityManager em;
    public DepartmentRepository(EntityManager em) {
        super(Department.class, em);
        this.em = em;
    }
    @Override
    public List<Department> findAll() {
        return em.createNativeQuery("Select * from \"flower\".\"Department\"", Department.class).getResultList();
    }
}