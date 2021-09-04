package io.github.bhuwanupadhyay.demo.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.Instant;


@Getter
@Setter
public abstract class Auditable {

    @Field(name = "created_by")
    private String createdBy;

    @Field(name = "created_date", type = FieldType.Date, format = DateFormat.date_time)
    private Instant createdDate;

    @Field(name = "last_modified_by")
    private String lastModifiedBy;

    @Field(name = "last_modified_date", type = FieldType.Date, format = DateFormat.date_time)
    private Instant lastModifiedDate;

}
