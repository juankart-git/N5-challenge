package co.com.n5.user.admin.rest;

import co.com.n5.user.admin.helper.ProductorKafka;
import co.com.n5.user.admin.model.Person;
import co.com.n5.user.admin.service.PersonService;
import co.com.n5.user.admin.utils.Constants;
import co.com.n5.user.admin.utils.UUIDGenerate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/person")
@Api(value = "Person resource REST Endpoint", description = "Person resource REST Endpoint, manage the Person info")
public class PersonREST {

    @Autowired
    private PersonService personService;

    @Autowired
    private UUIDGenerate uuidGenerate;

    @Autowired
    private ProductorKafka productorKafka;

    private final Constants constants;

    @ApiOperation(value = "Create Person in Database and return all person created")
    @PostMapping
    private ResponseEntity<Person> save (@RequestBody Person person) {
        try {
            Person personInsert = personService.create(person);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Person Created Id: " + person.getId());
            return ResponseEntity.created(new URI(constants.principalPath + constants.personPath + personInsert.getId()))
                    .body(personInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Person Created - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return all Person created in Database")
    @GetMapping
    private ResponseEntity<List<Person>> getAll () {
       try {
           String prueba = uuidGenerate.randomUUID().toString() + " - Person Consulted All";
           productorKafka.send(prueba);
           return ResponseEntity.ok(personService.getAll());
        } catch (Exception e){
           productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Person Consulted All - " + e.getMessage());
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return one Person created in Database by ID")
    @GetMapping (value = "/{id}")
    private ResponseEntity<Optional<Person>> getOne (@PathVariable ("id") Long id) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Person Consulted Id: " + id);
            return ResponseEntity.ok(personService.getOne(id));
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Person Consulted Id: " + id + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Delete a Person in Database by ID")
    @DeleteMapping
    private ResponseEntity<List<Person>> delete (@RequestBody Person person) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Person Deleted Id: " + person.getId());
            personService.delete(person);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Person Deleted Id: " + person.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Update a Person in Database by ID and return all person created")
    @PutMapping
    private ResponseEntity<Person> update (@RequestBody Person person) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Person Updated Id: " + person.getId());
            Person personInsert = personService.create(person);
            return ResponseEntity.created(new URI(constants.principalPath+constants.personPath + personInsert.getId()))
                    .body(personInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Person Updated Id: " + person.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
