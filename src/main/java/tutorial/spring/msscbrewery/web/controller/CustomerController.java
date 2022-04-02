package tutorial.spring.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tutorial.spring.msscbrewery.services.CustomerService;
import tutorial.spring.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path="/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId")UUID customerId){
     return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }
}
