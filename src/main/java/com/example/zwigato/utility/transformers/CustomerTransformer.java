package com.example.zwigato.utility.transformers;

import com.example.zwigato.dto.request.CustomerRequest;
import com.example.zwigato.model.Customer;

import java.util.ArrayList;

public class CustomerTransformer {

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .mobNo(customerRequest.getMobNo())
                .gender(customerRequest.getGender())
                .address(new ArrayList<>())
                .order(new ArrayList<>())
                .build();
    }
}
