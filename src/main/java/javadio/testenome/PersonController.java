package javadio.testenome;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.*;


@RestController
@RequestMapping("/api/persons")
@Validated
public class PersonController {

    @PostMapping
    public String createPerson(@RequestBody @Valid Person person) {
        return "Nome válido: " + person.getName();
    }
}
