package hystrixpoc.com.example.demo.infra.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI openAPI(@Value("${springdoc.version}") String appVersion, @Value("${springdoc.api-name}") String appName) {

        OpenAPI openApi = new OpenAPI().info(new Info().title(appName)
            .version(appVersion)
            .contact(contact())
        );

        openApi.components(new Components());
        return openApi;
    }

    private Contact contact() {
        Contact c = new Contact();
        c.name("Hystrix Demo");
        c.email("hystrix.demo@mail.com");
        return c;
    }
}
