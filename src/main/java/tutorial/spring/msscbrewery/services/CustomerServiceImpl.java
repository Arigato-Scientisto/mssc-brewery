package tutorial.spring.msscbrewery.services;

import org.springframework.stereotype.Service;
import tutorial.spring.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("saeufer")
                .build();
    }
}
