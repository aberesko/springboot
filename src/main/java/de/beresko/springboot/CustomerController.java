package de.beresko.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @RequestMapping(name = "/customer")
    public Customer get(@RequestParam(value = "id", required = true) Long id) {
        logger.info("Incoming request: GET /customer?id=" + id);
        return Customer.builder()
                .name("Alexander Schmitt")
                .email("aschme@me.com")
                .postal(65582)
                .build();
    }

}
