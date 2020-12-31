package com.mehmetpekdemir.contract.user;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Data
@Builder
class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String title;

}
