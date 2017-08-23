package tech.nodder.smartserve.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.nodder.smartserve.model.Customer;
import tech.nodder.smartserve.repositories.CustomerRepository;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void add(final Customer customer) {
        customerRepository.save(customer);
    }

    public Customer getSingleCustomer() {
        return (Customer) customerRepository.findAll().iterator().next();
    }
}
