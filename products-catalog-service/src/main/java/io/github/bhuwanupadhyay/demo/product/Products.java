package io.github.bhuwanupadhyay.demo.product;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "products", collectionResourceRel = "products", itemResourceRel = "product")
public interface Products extends JpaRepository<ProductEntity, Long> {

    @Override
    @RestResource(exported = false)
    ProductEntity getOne(Long aLong);

    @Override
    @RestResource(exported = false)
    ProductEntity getById(Long aLong);

    @Override
    @RestResource(exported = false)
    List<ProductEntity> findAll();

    @Override
    @RestResource(exported = false)
    List<ProductEntity> findAll(Sort sort);

    @Override
    @RestResource(exported = false)
    List<ProductEntity> findAllById(Iterable<Long> longs);

    @Override
    @RestResource(exported = false)
    <S extends ProductEntity> List<S> findAll(Example<S> example);

    @Override
    @RestResource(exported = false)
    <S extends ProductEntity> List<S> findAll(Example<S> example, Sort sort);

    @Override
    @RestResource(exported = false)
    Page<ProductEntity> findAll(Pageable pageable);

    @Override
    @RestResource(exported = false)
    Optional<ProductEntity> findById(Long aLong);

    @Override
    @RestResource(exported = false)
    boolean existsById(Long aLong);

    @Override
    @RestResource(exported = false)
    long count();

    @Override
    @RestResource(exported = false)
    <S extends ProductEntity> Optional<S> findOne(Example<S> example);

    @Override
    @RestResource(exported = false)
    <S extends ProductEntity> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    @RestResource(exported = false)
    <S extends ProductEntity> long count(Example<S> example);

    @Override
    @RestResource(exported = false)
    <S extends ProductEntity> boolean exists(Example<S> example);
}
