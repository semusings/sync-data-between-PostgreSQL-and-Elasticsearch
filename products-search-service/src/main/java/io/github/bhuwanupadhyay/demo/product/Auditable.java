package io.github.bhuwanupadhyay.demo.product;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;


@Getter
@Setter
public abstract class Auditable<U> {

    private U createdBy;

    private Instant createdDate;

    private U lastModifiedBy;

    private Instant lastModifiedDate;

}
