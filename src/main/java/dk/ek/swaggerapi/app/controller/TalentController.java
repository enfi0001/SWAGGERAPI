package dk.ek.swaggerapi.app.controller;

import dk.ek.swaggerapi.app.model.Document;
import dk.ek.swaggerapi.app.model.Talent;
import dk.ek.swaggerapi.app.service.TalentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/talents")
public class TalentController {
    private final TalentService talentService;

    public TalentController(TalentService talentService) {
        this.talentService = talentService;
    }

    @GetMapping
    public List<Talent> getAllTalents() {
        return talentService.getAllTalents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Talent> getTalentById(@PathVariable String id) {
        return talentService.getTalentById(UUID.fromString(id))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/documents")
    public List<Document> getDocuments(@PathVariable String id) {
        return talentService.getDocumentsForTalent(UUID.fromString(id));
    }

    @GetMapping("/{id}/documents/{documentId}")
    public ResponseEntity<Document> getDocument(
            @PathVariable String id,
            @PathVariable String documentId) {
        return talentService.getDocumentById(
                        UUID.fromString(id),
                        UUID.fromString(documentId))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
