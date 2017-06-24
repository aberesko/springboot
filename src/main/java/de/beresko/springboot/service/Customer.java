package de.beresko.springboot.service;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    public String name;
    public Integer postal;
    public String email;
}
