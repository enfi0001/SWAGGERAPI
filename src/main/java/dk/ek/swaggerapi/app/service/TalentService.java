package dk.ek.swaggerapi.app.service;

import dk.ek.swaggerapi.app.model.Document;
import dk.ek.swaggerapi.app.model.Talent;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class TalentService {
    private final Map<UUID, Talent> talents = new HashMap<>();
    private final Map<UUID, List<Document>> documents = new HashMap<>();

    public TalentService(){
        UUID myId = UUID.randomUUID();

        Talent me = new Talent();
        me.setId(myId);
        me.setName("Enes Zeki Filikci");
        me.setTitle("Datamatiker studerende");
        me.setProfileText("""
        Jeg er Enes Zeki Filikci, 20 år og Datamatikerstuderende på 4. semester ved Erhvervsakademi København.
        Jeg nyder at arbejde i teams, hvor videndeling og samarbejde fører til bedre og mere gennemtænkte løsninger.
        Gennem mit studie har jeg opbygget en solid forståelse for softwareudvikling og problemløsning.
        Jeg er motiveret for at udvikle mine kompetencer yderligere og anvende dem i praksisnære projekter.""" );
        me.setEmail("enesfilikci123@gmail.com");
        me.setPhone("+4521804346");
        me.setCity("Kokkedal");
        me.setCountry("Danmark");
        me.setGithub("https://github.com/enfi0001");
        me.setLinkedin("https://www.linkedin.com/in/enes-filikci-960763363/");

        talents.put(myId, me);

        Document TechChapter = new Document();
        TechChapter.setId(UUID.randomUUID());
        TechChapter.setName("Hvorfor Tech Chapter");
        TechChapter.setContent("""
                Tech Chapter tiltaler mig, fordi jeg oplever virksomheden som målrettet og præget af en stærk holdmentalitet.
                Fokus på samarbejde, åben kommunikation og fælles ansvar for at løse komplekse problemstillinger stemmer godt overens med mine egne styrker og arbejdsform.
                Jeg motiveres af at arbejde i et miljø, hvor man udfordres fagligt og udvikler sig som et team. Dette er noget, jeg tydeligt ser i Tech Chapter, og det er en vigtig faktor for mig, da jeg ønsker at vokse både fagligt og personligt.
                Tech Chapter vil være et nyt og udfordrende miljø for mig, hvilket jeg ser som en værdifuld mulighed for at udvikle mine kompetencer og opnå praktisk erfaring i en professionel it-virksomhed.
                Derudover værdsætter jeg Tech Chapters fokus på medarbejderen, herunder frihed, fleksibilitet og en arbejdskultur, hvor trivsel og faglig udvikling prioriteres højt.""");

        Document KomptenceOversigt = new Document();
        KomptenceOversigt.setId(UUID.randomUUID());
        KomptenceOversigt.setName("Kompetenceoversigt");
        KomptenceOversigt.setContent("""                
                - Backend: Java, Python, Spring Boot, Rest API, http, JUnit, Mockito, Postman, Maven.
                - Frontend: HTML, CSS, JavaScript, React.
                - Databaser: MySQL, PostgreSQL, H2 (test og udvikling), Flyway.
                - Version Control: Git, GitHub.
                - DevOps & Deployment: Docker, Docker Compose, CI/CD, GitHub Actions.
                - Cloud & Hosting: Azure, DigitalOcean, Hostinger.
                - Arbejdsmetoder: Scrum, Vandfald, XP.
                - Problemløsning: Stærke analytiske evner og en kreativ tilgang til at løse komplekse udfordringer, med fokus på at holde løsningerne stabile, vedvarende og robuste.
                - Kommunikation: Evnen til effektivt at kommunikere i teams, dele viden og forklare tekniske koncepter til ikke-tekniske interessenter. Jeg har ofte erfaring med at forklare min kode og kodeverdenen til personer uden teknisk baggrund.
                - Samarbejde: Erfaring med tværfagligt samarbejde i agile teams, hvor jeg aktivt bidrager til et positivt og produktivt arbejdsmiljø og fremmer fælles mål. Jeg lægger stor vægt på struktur, overholdelse af deadlines, klar kommunikation og vigtigst af alt et sundt og motiverende arbejdsmiljø i teamet.""");

        Document Erfaring = new Document();
        Erfaring.setId(UUID.randomUUID());
        Erfaring.setName("Erfaring");
        Erfaring.setContent("""
                Føtex (2021 - 2022)
                Min karriere ude i det "rigtige liv" startede som 15-årig i Føtex, hvor jeg lærte en masse som ung. 
                Her opbyggede jeg disciplin, selvstændighed og de første erfaringer med kommunikation på arbejdsmarkedet. 
                Selvom det måske ikke virker imponerende, har min periode i Føtex givet mig værdifulde erfaringer, som jeg stadig trækker på i dag - derfor inddrager jeg det her.
                
                Den Søde Tand (2022 - 2024)
                Jeg fik muligheden for at arbejde i en detailhandelsbutik, hvor arbejdsdagene hurtigt blev mere krævende, da jeg fra start fik ansvar, der nærmest svarer til en butikschef. 
                Min chef havde stor tillid til mig og kunne se ledelsespotentiale, hvilket jeg fik lov til at udnytte. Jeg stod blandt andet for vagtplaner, bestilling af varer fra både ind- og udland, prissætning og mange andre opgaver. 
                Dette har givet mig selvsikkerhed, forståelse for ledelse, planlægning, kommunikation med kunder og kollegaer samt evnen til at løse problemer under pres.
                
                ARA Biler (2024)
                I dag arbejder jeg som sælger hos ARA Biler, hvor jeg står for køb, salg og bytte af biler. 
                Her har jeg opbygget stærke kompetencer inden for kommunikation, tillidsopbygning med kunder, forståelse for forhandling og afdækning af kundens behov.
                Derudover har jeg haft mulighed for at inddrage mine tekniske kompetencer fra min datamatikeruddannelse, hvor jeg har udviklet et digitalt system, 
                som gør B2C-processer hurtigere og nemmere, digitaliserer købskontrakter og salgsaftaler og gør arbejdsgangen nemmere - både personligt for mig selv og mine kollegaer.
                
                TeqS I/S (2025)
                Derudover er jeg medstifter af TeqS I/S sammen med en partner. Projektet startede spontant og er ikke et vedvarende kommercielt projekt, men blev etableret for at opnå erfaring og udvikle selvstændighed. 
                Gennem TeqS I/S har jeg fået en bredere forståelse for it-verdenen, som jeg fremadrettet kan anvende i kommende arbejdspladser inden for it. 
                Jeg ser dette projekt som en lærerig og sjov rejse, som vil give mig værdifuld erfaring, når jeg bevæger mig videre til en mere formel stilling i en it-virksomhed.""");

        Document SamarbejdsOnske = new Document();
        SamarbejdsOnske.setId(UUID.randomUUID());
        SamarbejdsOnske.setName("Samarbejdsønske");
        SamarbejdsOnske.setContent("""
                Jeg ønsker muligheden for at få praktikplads sammen med min gode ven AbdulCelil Sekerci, som jeg har arbejdet sammen med på mange forskellige projekter af forskellige arter og problemstillinger.
                Vi kender hinandens styrker og svagheder, og jeg mener, at vi positivt kan udnytte dette i Tech Chapter.
                Da vi arbejder godt sammen og kommunikerer effektivt og tror jeg, at det vil lette jeres indsats med at introducere os til jeres materiale og processer.
                """);

       Document HvordanApiVirker = new Document();
       HvordanApiVirker.setId(UUID.randomUUID());
       HvordanApiVirker.setName("Hvordan denne API virker");
       HvordanApiVirker.setContent("""
               Hvordan denne API er bygget:
               
               (1) Introduktion
               Formål:
               Denne API er udviklet i Java med Spring Boot og eksponerer talentdata og tilhørende dokumenter i JSON-format via REST-endpoints. Fokus er enkel struktur, separation af ansvar og mulighed for senere udvidelser.
               
               (2) Teknologistack
               Brugte teknologier:
               - Java
               - Spring Boot
               - Maven
               - Lombok (genererer getters/setters m.v.)
               - Jackson (JSON-serialisering)
               
               Eksempel:
               Spring Boot håndterer REST-konfiguration og dependency injection. Jackson serialiserer automatisk Java-objekter til JSON responses.
               
               (3) Arkitektur (Lagopdeling)
               Lag:
               - Controller -> Service -> Model
               
               Forklaring:
               - Controller
                 - Modtager HTTP requests
                 - Mapper URL’er til metoder og returnerer JSON
               - Service
                 - Indeholder simpel forretningslogik
                 - Holder data in-memory og håndterer opslag/filtrering
               - Model
                 - Repræsenterer domæneobjekter som `Talent` og `Document`
                 - Brug af Lombok for at minimere boilerplate
               
               Bemærkning:
               Der er ikke et repository-lag i denne version, da data er in-memory via `Map`. Et repository kan tilføjes senere for databaseadgang.
               
               (4) Model-struktur
               Talent:
               - Felter for id (UUID), navn, titel, profiltekst, kontaktoplysninger og links.
               - Bruger Lombok til getters/setters for at reducere boilerplate.
               - JSON-rækkefølge styres med `@JsonPropertyOrder` for konsistent output.
               
               Hvorfor UUID:
               - UUID giver unikke og robuste id’er.
               
               Lombok:
               - Reducerer kodeomfang og øger læsbarhed ved at generere standardmetoder.
               
               JSON-generering:
               - Jackson konverterer automatisk objekter til JSON baseret på felterne.
               
               (5) JSON Struktur
               Generering:
               - Ved GET-requests returnerer controlleren Java-objekter som automatisk serialiseres til JSON via Jackson.
               - `@JsonPropertyOrder` sikrer feltrækkefølge i output.
               - API’en understøtter multilinjetekst, hvor linjeskift bevares og automatisk konverteres til '\n' i JSON-outputtet.
               
               (6) Endpoints
               Liste:
               - GET `/talents`
                 - Returnerer alle talents.
               - GET `/talents/{id}`
                 - Returnerer ét talent ud fra UUID.
               - GET `/talents/{id}/documents`
                 - Returnerer alle dokumenter for et talent.
               - GET `/talents/{id}/documents/{documentId}`
                 - Returnerer et specifikt dokument for et talent.
               
               Beskrivelse:
               Controlleren validerer path-variabler og bruger service-laget til dataopslag. Manglende data returneres som HTTP 404.
               
               (7) Designvalg
               Refleksion:
               - Klar lagseparation: Controller håndterer HTTP, Service håndterer logik, Model beskriver data.
               - Læsbar og enkel kode baseret på Spring Boot-konventioner.
               - Udvidelsesmuligheder: In-memory data kan erstattes med database og repository-lag uden at ændre API-kontrakter.
               - Konsistent JSON output via `@JsonPropertyOrder`.
               - Brug af UUID for robuste id’er og Lombok for mindre boilerplate, hvilket forbedrer vedligeholdelse.
               
               (8) Containerisering
               
               Formål:
               Applikationen er containeriseret ved hjælp af Docker for at sikre ensartet kørsel på tværs af miljøer og for at gøre deployment enkel og reproducerbar.
               
               Implementering:
               - Projektet buildes til en eksekverbar JAR-fil via Maven.
               - Der anvendes en Dockerfile baseret på en letvægts Java 21 base-image.
               - JAR-filen kopieres ind i containeren og eksekveres via en ENTRYPOINT-kommando.
               - Port 8080 eksponeres, så API’en kan tilgås udefra.
               
               Fordele:
               - Miljøuafhængig kørsel (”It works on my machine”-problemet undgås).
               - Nem deployment via docker run.
               - Mulighed for senere integration med CI/CD pipelines og cloud-platforme.
               - Image’et er publiceret i et container registry og kan trækkes direkte via docker pull.
               
               Eksempel på kørsel:
               - docker pull <brugernavn>/talent-api
               - docker run -p 8080:8080 <brugernavn>/talent-api
               """);



        documents.put(myId, List.of(TechChapter, KomptenceOversigt, Erfaring, SamarbejdsOnske, HvordanApiVirker));
    }




    public List<Talent> getAllTalents(){
        return new ArrayList<>(talents.values());
    }

    public Optional<Talent> getTalentById(UUID Id){
        return Optional.ofNullable(talents.get(Id));
    }

    public List<Document> getDocumentsForTalent(UUID talentId) {
        return documents.getOrDefault(talentId, Collections.emptyList());
    }

    public Optional<Document> getDocumentById(UUID talentId, UUID docId) {
        return documents.getOrDefault(talentId, Collections.emptyList())
                .stream()
                .filter(doc -> doc.getId().equals(docId))
                .findFirst();
    }

}
