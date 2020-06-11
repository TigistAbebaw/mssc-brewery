package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
