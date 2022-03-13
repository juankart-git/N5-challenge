package co.com.n5.user.admin.rest;

import co.com.n5.user.admin.helper.ProductorKafka;
import co.com.n5.user.admin.model.AccessByPerson;
import co.com.n5.user.admin.service.AccessByPersonService;
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

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/access_by_person")
@Api(value = "Access by Person resource REST Endpoint", description = "Access by Person resource REST Endpoint, manage the Access by Person info")
public class AccessByPersonREST {

    @Autowired
    private AccessByPersonService accessByPersonService;

    @Autowired
    private UUIDGenerate uuidGenerate;

    @Autowired
    private ProductorKafka productorKafka;

    private final Constants constants;

    @ApiOperation(value = "Create Access by Person in Database and return item created")
    @PostMapping
    private ResponseEntity<AccessByPerson> save (@RequestBody AccessByPerson accessByPerson) {
        try {
            AccessByPerson newInsert = accessByPersonService.create(accessByPerson);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access By Person Created Id: " + newInsert.getId());
            return ResponseEntity.created(new URI(constants.principalPath+constants.accessByRolePath)).body(newInsert);
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access By Person Created  - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return all Ccess by Person created in Database")
    @GetMapping
    private ResponseEntity<List<AccessByPerson>> getAll () {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access By Person Consulted All");
            return ResponseEntity.ok(accessByPersonService.getAll());
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access By Person Consulted All - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Delete a Access by Person in Database by ID")
    @DeleteMapping
    private ResponseEntity<List<AccessByPerson>> delete (@RequestBody AccessByPerson accessByPerson) {
        try {
            accessByPersonService.delete(accessByPerson);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access By Person Deleted Id: " + accessByPerson.getId());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access By Person Deleted Id: " +  accessByPerson.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Update a Access by Person in Database by ID and return item created")
    @PutMapping
    private ResponseEntity<AccessByPerson> update (@RequestBody AccessByPerson accessByPerson) {
        try {
            AccessByPerson newInsert = accessByPersonService.create(accessByPerson);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access By Person Updated Id: " + accessByPerson.getId());
            return ResponseEntity.created(new URI(constants.principalPath+constants.accessByRolePath)).body(newInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access By Person Updated Id: " + accessByPerson.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
