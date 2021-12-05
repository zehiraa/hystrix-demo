package hystrixpoc.com.example.demo.external.client.gender;

import feign.Headers;
import hystrixpoc.com.example.demo.external.client.gender.model.GenderResponse;
import hystrixpoc.com.example.demo.infra.feign.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "GenderClient", url = "${api.gender-api.host}", configuration = FeignClientConfiguration.class, fallback = GenderClientFallback.class)
public interface GenderClient {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/{fake}")
    @Headers({"Content-Type: application/json"})
    GenderResponse getGenderByName(@PathVariable(value= "fake") String fake, @RequestParam(value = "name") String name);
}
