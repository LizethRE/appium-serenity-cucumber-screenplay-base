package com.base.certification.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Date {
    int day;
    int month;
    int year;
}
