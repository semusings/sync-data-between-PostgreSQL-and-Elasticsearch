package io.github.bhuwanupadhyay.demo.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Document(indexName = "products")
public class ProductSearchEntity extends Auditable<String> implements Serializable {

    @Id
    @Field(name = "product_id")
    private Long id;

    @Field(name = "product_name")
    private String name;

    @Field(name = "product_description")
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSearchEntity that = (ProductSearchEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

