package io.github.bhuwanupadhyay.demo.repositories;

import io.github.bhuwanupadhyay.demo.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "products", collectionResourceRel = "products", itemResourceRel = "product")
public interface Products extends JpaRepository<ProductEntity, Long> {
}
