package com.chickentest.egg.repository;

import com.chickentest.egg.model.Egg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EggRepository extends JpaRepository<Egg,Long> {
}
