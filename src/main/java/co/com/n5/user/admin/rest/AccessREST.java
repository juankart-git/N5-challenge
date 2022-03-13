package co.com.n5.user.admin.rest;

import co.com.n5.user.admin.helper.ProductorKafka;
import co.com.n5.user.admin.model.Access;
import co.com.n5.user.admin.service.AccessService;
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
@RequestMapping("/api/v1/access")
@Api(value = "Access resource REST Endpoint", description = "Access resource REST Endpoint, manage the Access info")
public class AccessREST {

    @Autowired
    private AccessService accessService;

    @Autowired
    private UUIDGenerate uuidGenerate;

    @Autowired
    private ProductorKafka productorKafka;

    private final Constants constants;

    @ApiOperation(value = "Create Access in Database and return item created")
    @PostMapping
    private ResponseEntity<Access> save (@RequestBody Access access) {
        try {
            Access accessInsert = accessService.create(access);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access By Role Created Id: " + access.getId());
            return ResponseEntity.created(new URI(constants.principalPath+constants.accessPath+accessInsert.getId())).body(accessInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access By Role Created - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return all Access created in Database")
    @GetMapping
    private ResponseEntity<List<Access>> getAll () {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access Consulted All" );
            return ResponseEntity.ok(accessService.getAll());
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access Consulted All - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return one Access created in Database by ID")
    @GetMapping (value = "/{id}")
    private ResponseEntity<Optional<Access>> getOne (@PathVariable ("id") Long id) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access Consulted Id: " + id);
            return ResponseEntity.ok(accessService.getOne(id));
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access Consulted Id: " + id + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Delete a Access in Database by ID")
    @DeleteMapping
    private ResponseEntity<List<Access>> delete (@RequestBody Access access) {
        try {
            accessService.delete(access);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access Deleted Id: " + access.getId());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access Deleted Id: " + access.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Update a Access in Database by ID and return all person created")
    @PutMapping
    private ResponseEntity<Access> update (@RequestBody Access access) {
        try {
            Access genderInsert = accessService.create(access);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Access Created Id: " + access.getId());
            return ResponseEntity.created(new URI(constants.principalPath+constants.accessPath+genderInsert.getId())).body(genderInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Access Created Id: " + access.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
