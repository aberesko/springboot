package de.beresko.springboot;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    public String name;
    public Integer postal;
    public String email;

}
