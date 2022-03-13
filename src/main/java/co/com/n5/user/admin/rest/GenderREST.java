package co.com.n5.user.admin.rest;

import co.com.n5.user.admin.helper.ProductorKafka;
import co.com.n5.user.admin.model.Gender;
import co.com.n5.user.admin.service.GenderService;
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
@RequestMapping("/api/v1/gender")
@Api(value = "Gender resource REST Endpoint", description = "Gender resource REST Endpoint, manage the Gender info")
public class GenderREST {

    @Autowired
    private GenderService genderService;

    @Autowired
    private ProductorKafka productorKafka;

    @Autowired
    private UUIDGenerate uuidGenerate;

    private final Constants constants;

    @ApiOperation(value = "Create Gender in Database and return item created")
    @PostMapping
    private ResponseEntity<Gender> save (@RequestBody Gender gender) {
        try {
            Gender genderInsert = genderService.create(gender);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Gender Created Id: " + gender.getId());
            return ResponseEntity.created(new URI(constants.principalPath+constants.genderPath+genderInsert.getId())).body(genderInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Gender Created - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return all Gender created in Database")
    @GetMapping
    private ResponseEntity<List<Gender>> getAll () {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Gender Consulted All");
            return ResponseEntity.ok(genderService.getAll());
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Gender Consulted All - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return one Gender created in Database by ID")
    @GetMapping (value = "/{id}")
    private ResponseEntity<Optional<Gender>> getOne (@PathVariable ("id") Long id) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Gender Consulted Id: " + id);
            return ResponseEntity.ok(genderService.getOne(id));
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Gender Consulted Id: " + id + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Delete a Gender in Database by ID")
    @DeleteMapping
    private ResponseEntity<List<Gender>> delete (@RequestBody Gender gender) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Gender Deleted Id: " + gender.getId());
            genderService.delete(gender);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Gender Deleted Id: " + gender.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Update a Gender in Database by ID and return item created")
    @PutMapping
    private ResponseEntity<Gender> update (@RequestBody Gender gender) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Gender Updated Id: " + gender.getId());
            Gender genderInsert = genderService.create(gender);
            return ResponseEntity.created(new URI(constants.principalPath+constants.genderPath+genderInsert.getId())).body(genderInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Gender Updated Id: " + gender.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
