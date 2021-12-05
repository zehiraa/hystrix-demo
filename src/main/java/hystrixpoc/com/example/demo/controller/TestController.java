package hystrixpoc.com.example.demo.controller;

import hystrixpoc.com.example.demo.external.client.gender.GenderService;
import hystrixpoc.com.example.demo.external.client.gender.model.GenderResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/demo", produces = APPLICATION_JSON_VALUE)
public class TestController {

    private final GenderService genderService;

    @GetMapping("/test")
    @Operation(summary = "get gender info by name")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200"),
    })
    public ResponseEntity<GenderResponse> genderByName(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "fake", required = false) String fake) {
        return ResponseEntity.ok(genderService.getGenderByName(fake, name));
    }
}
