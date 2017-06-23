package de.beresko.springboot;

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
