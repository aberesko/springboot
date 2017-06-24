package de.beresko.springboot.service;

import de.beresko.springboot.external.Quote;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Log
@RestController
public class CustomerController {

    @RequestMapping(name = "/customer")
    public Customer get(@RequestParam(value = "id", required = true) Long id) {
        log.info("Incoming request: GET /customer?id=" + id);
        doExternalRestCall();
        return Customer.builder()
                .name("Alexander Schmitt")
                .email("aschme@me.com")
                .postal(65582)
                .build();
    }

    private void doExternalRestCall() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info("quote=" + quote);
    }

}
