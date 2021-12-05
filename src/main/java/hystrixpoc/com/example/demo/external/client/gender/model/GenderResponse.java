package hystrixpoc.com.example.demo.external.client.gender.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenderResponse {
    public String name;
    public String gender;
    public Double probability;
    public Long count;
}

