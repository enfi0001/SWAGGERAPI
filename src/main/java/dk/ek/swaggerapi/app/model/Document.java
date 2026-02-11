package dk.ek.swaggerapi.app.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@JsonPropertyOrder({"id", "name", "content"})

@Getter
@Setter
public class Document {
    private UUID id;
    private String name;
    private String content;
}
