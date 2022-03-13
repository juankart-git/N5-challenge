package co.com.n5.user.admin.rest;

import co.com.n5.user.admin.helper.ProductorKafka;
import co.com.n5.user.admin.model.DocumentType;
import co.com.n5.user.admin.service.DocumentTypeService;
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
@RequestMapping("/api/v1/document_type")
@Api(value = "Document Type resource REST Endpoint", description = "Document Type resource REST Endpoint, manage the Document Type info")
public class DocumentTypeREST {

    @Autowired
    private DocumentTypeService documentTypeService;

    @Autowired
    private UUIDGenerate uuidGenerate;

    @Autowired
    private ProductorKafka productorKafka;

    private final Constants constants;

    @ApiOperation(value = "Create Document Type in Database and return item created")
    @PostMapping
    private ResponseEntity<DocumentType> save (@RequestBody DocumentType documentType) {
        try {
            DocumentType documentTypeInsert = documentTypeService.create(documentType);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Document Type Created Id: " + documentType.getId());
            return ResponseEntity.created(new URI(constants.principalPath+constants.documentTypePath+documentTypeInsert.getId())).body(documentTypeInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Document Type Created Id - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return all Document Type created in Database")
    @GetMapping
    private ResponseEntity<List<DocumentType>> getAll () {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Document Type Consulted All");
            return ResponseEntity.ok(documentTypeService.getAll());
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Document Type Consulted All - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Return one Document Type created in Database by ID")
    @GetMapping (value = "/{id}")
    private ResponseEntity<Optional<DocumentType>> getOne (@PathVariable ("id") Long id) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Document Type Consulted Id: " + id);
            return ResponseEntity.ok(documentTypeService.getOne(id));
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Document Type Consulted Id: " + id + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Delete a Document Type in Database by ID")
    @DeleteMapping
    private ResponseEntity<List<DocumentType>> delete (@RequestBody DocumentType documentType) {
        try {
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Document Type Deleted Id: " + documentType.getId());
            documentTypeService.delete(documentType);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Document Type Deleted Id: " + documentType.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @ApiOperation(value = "Update a Document Type in Database by ID and return all person created")
    @PutMapping
    private ResponseEntity<DocumentType> update (@RequestBody DocumentType documentType) {
        try {
            DocumentType documentTypeInsert = documentTypeService.create(documentType);
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - Document Type Updated Id: " + documentType.getId());
            return ResponseEntity.created(new URI(constants.principalPath+constants.documentTypePath+documentTypeInsert.getId())).body(documentTypeInsert);
        }catch (Exception e){
            productorKafka.send(uuidGenerate.randomUUID().toString() + " - ERROR Document Type Updated Id: " + documentType.getId() + " - " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
