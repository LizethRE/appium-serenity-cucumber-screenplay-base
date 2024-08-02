package com.base.certification.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    String name;
    String phoneNumber;
    String password;
}
