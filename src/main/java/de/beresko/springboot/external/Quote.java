package de.beresko.springboot.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import de.beresko.springboot.external.Value;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

}