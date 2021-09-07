package io.github.bhuwanupadhyay.demo.core;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface WriteOnlyRestRepository<T, ID> extends JpaRepository<T, ID> {
    
    @Override
    @RestResource(exported = false)
    List<T> findAll();

    @Override
    @RestResource(exported = false)
    List<T> findAll(Sort sort);

    @Override
    @RestResource(exported = false)
    List<T> findAllById(Iterable<ID> ids);

    @Override
    @RestResource(exported = false)
    T getOne(ID id);

    @Override
    @RestResource(exported = false)
    T getById(ID id);

    @Override
    @RestResource(exported = false)
    <S extends T> List<S> findAll(Example<S> example);

    @Override
    @RestResource(exported = false)
    <S extends T> List<S> findAll(Example<S> example, Sort sort);

    @Override
    @RestResource(exported = false)
    Page<T> findAll(Pageable pageable);

    @Override
    @RestResource(exported = false)
    Optional<T> findById(ID id);

    @Override
    @RestResource(exported = false)
    boolean existsById(ID id);

    @Override
    @RestResource(exported = false)
    long count();

    @Override
    @RestResource(exported = false)
    <S extends T> Optional<S> findOne(Example<S> example);

    @Override
    @RestResource(exported = false)
    <S extends T> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    @RestResource(exported = false)
    <S extends T> long count(Example<S> example);

    @Override
    @RestResource(exported = false)
    <S extends T> boolean exists(Example<S> example);
}
