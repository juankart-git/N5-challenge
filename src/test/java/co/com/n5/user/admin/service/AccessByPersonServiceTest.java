package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.Access;
import co.com.n5.user.admin.model.AccessByPerson;
import co.com.n5.user.admin.repository.AccessByPersonRepository;
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

class AccessByPersonServiceTest {

    @Mock
    private AccessByPersonRepository accessByPersonRepository;

    @InjectMocks
    private AccessByPersonService accessByPersonService;

    private AccessByPerson accessByPerson;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        accessByPerson = new AccessByPerson();
        accessByPerson.setIdAccess(1L);
        accessByPerson.setIdAccess(1L);
    }

    @Test
    void create() {
        when(accessByPersonRepository.save(accessByPerson)).thenReturn(accessByPerson);
        assertNotNull(accessByPersonService.create(accessByPerson));
    }

    @Test
    void getAll() {
        when(accessByPersonRepository.findAll()).thenReturn(Arrays.asList(accessByPerson));
        assertNotNull(accessByPersonService.getAll());
    }

    @Test
    void update() {
        when(accessByPersonRepository.save(accessByPerson)).thenReturn(accessByPerson);
        accessByPersonService.update(accessByPerson);
    }

    @Test
    void getOne() {
        when(accessByPersonRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(accessByPerson));
        assertNotNull(accessByPersonService.getOne(1L));
    }

    @Test
    void delete() {
        when(accessByPersonRepository.findById(accessByPerson.getId())).thenReturn(Optional.of(accessByPerson));
        accessByPersonService.delete(accessByPerson);
    }
}