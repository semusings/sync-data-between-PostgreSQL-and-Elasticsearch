package io.github.bhuwanupadhyay.demo.product;

import io.github.bhuwanupadhyay.demo.core.ReadOnlyRestRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "products", itemResourceRel = "product", collectionResourceRel = "products")
public interface Products extends ReadOnlyRestRepository<ProductSearchEntity, Long> {

    <S extends ProductSearchEntity> S findByNameLike(String name);

}
