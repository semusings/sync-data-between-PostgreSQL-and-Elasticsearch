package io.github.bhuwanupadhyay.demo.product;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "products", itemResourceRel = "product", collectionResourceRel = "products")
public interface Products extends ElasticsearchRepository<ProductSearchEntity, Long> {

    @Override
    @RestResource(exported = false)
    <S extends ProductSearchEntity> S save(S entity);

    @Override
    @RestResource(exported = false)
    <S extends ProductSearchEntity> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);

    @Override
    @RestResource(exported = false)
    void delete(ProductSearchEntity entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ProductSearchEntity> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
