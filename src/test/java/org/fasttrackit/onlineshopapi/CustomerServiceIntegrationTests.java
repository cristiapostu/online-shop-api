package org.fasttrackit.onlineshopapi;


import org.fasttrackit.onlineshopapi.service.CustomerService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceIntegrationTests {


    @Autowired
    private CustomerService customerService;

}
