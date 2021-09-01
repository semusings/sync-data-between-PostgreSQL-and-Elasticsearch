package io.github.bhuwanupadhyay.demo.repositories;

import io.github.bhuwanupadhyay.demo.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "categories", collectionResourceRel = "categories", itemResourceRel = "category")
public interface Categories extends JpaRepository<CategoryEntity, Long> {
}
