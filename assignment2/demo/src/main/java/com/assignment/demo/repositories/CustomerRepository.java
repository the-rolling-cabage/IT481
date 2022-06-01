package com.assignment.demo.repositories;

import com.assignment.demo.repositories.models.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, String> {
}
