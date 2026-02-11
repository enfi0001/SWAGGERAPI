package dk.ek.swaggerapi.app.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@JsonPropertyOrder({"id", "name", "title", "profileText", "email", "phone", "city", "country", "github", "linkedin"})


@Getter
@Setter
public class Talent {
    private UUID id;
    private String name;
    private String title;
    private String profileText;
    private String email;
    private String phone;
    private String city;
    private String country;
    private String github;
    private String linkedin;
}
