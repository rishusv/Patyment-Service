package org.userservice.paymentservice.models;

import lombok.Getter;
import lombok.Setter;

// @MappedSuperclass
@Getter
@Setter
public class BaseModel {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}