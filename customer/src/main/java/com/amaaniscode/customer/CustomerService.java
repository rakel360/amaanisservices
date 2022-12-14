package com.amaaniscode.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer=Customer.builder()
                .firstName(request.firstName())
                .lasName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }

    //todo:check if email is valid
    //todo:check if email is not taken


}
