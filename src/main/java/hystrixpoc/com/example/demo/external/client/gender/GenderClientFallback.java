package hystrixpoc.com.example.demo.external.client.gender;

import hystrixpoc.com.example.demo.external.client.gender.model.GenderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GenderClientFallback implements GenderClient {
    @Override
    public GenderResponse getGenderByName(String fake, String name) {
        log.warn("************** getGenderByName from fallback, name: {}  **************", name);
        return GenderResponse.builder().name("fallback-name").count(1L).gender("LGBT").probability(0.1).build();
    }
}
