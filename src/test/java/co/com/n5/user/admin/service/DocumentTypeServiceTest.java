package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.DocumentType;
import co.com.n5.user.admin.repository.DocumentTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class DocumentTypeServiceTest {

    @Mock
    private DocumentTypeRepository documentTypeRepository;

    @InjectMocks
    private DocumentTypeService documentTypeService;

    private DocumentType documentType;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        documentType = new DocumentType();
        documentType.setId(1L);
        documentType.setDescription("DocumentType 1");
        documentType.setName("DocumentType 1");
    }

    @Test
    void create() {
        when(documentTypeRepository.save(documentType)).thenReturn(documentType);
        assertNotNull(documentTypeService.create(documentType));
    }

    @Test
    void getAll() {
        when(documentTypeRepository.findAll()).thenReturn(Arrays.asList(documentType));
        assertNotNull(documentTypeService.getAll());
    }

    @Test
    void update() {
        when(documentTypeRepository.save(documentType)).thenReturn(documentType);
        documentTypeService.update(documentType);
    }

    @Test
    void getOne() {
        when(documentTypeRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(documentType));
        assertNotNull(documentTypeService.getOne(1L));
    }

    @Test
    void delete() {
        when(documentTypeRepository.findById(documentType.getId())).thenReturn(Optional.of(documentType));
        documentTypeService.delete(documentType);
    }
}