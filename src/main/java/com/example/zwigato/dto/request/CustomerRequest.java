package com.example.zwigato.dto.request;

import com.example.zwigato.utility.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerRequest {

    private String name;

    private String mobNo;

    private Gender gender;
}
