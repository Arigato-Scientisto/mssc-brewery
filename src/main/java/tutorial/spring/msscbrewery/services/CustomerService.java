package tutorial.spring.msscbrewery.services;

import tutorial.spring.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
