package io.github.bhuwanupadhyay.demo.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;

import java.time.Instant;


@Getter
@Setter
public abstract class Auditable<U> {

    @Field(name = "created_by")
    private U createdBy;

    @Field(name = "created_date")
    private Instant createdDate;

    @Field(name = "last_modified_by")
    private U lastModifiedBy;

    @Field(name = "last_modified_date")
    private Instant lastModifiedDate;

}
