package hystrixpoc.com.example.demo.external.client.gender;

import hystrixpoc.com.example.demo.external.client.gender.model.GenderResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GenderService {

    private final GenderClient genderClient;

    public GenderResponse getGenderByName(String fake, String name) {
        return genderClient.getGenderByName(fake, name);
    }
}
