package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.Person;
import co.com.n5.user.admin.repository.PersonRepository;
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

class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    private Person person;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        person = new Person();
        person.setId(1L);
        person.setFirstName("First Name");
        person.setLastName("Last Name");
        person.setDocumentNumber("123456");
        person.setGender(1L);
        person.setBirthday("01/01/1991");
        person.setDocumentType(1L);
    }

    @Test
    void create() {
        when(personRepository.save(person)).thenReturn(person);
        assertNotNull(personService.create(person));
    }

    @Test
    void getAll() {
        when(personRepository.findAll()).thenReturn(Arrays.asList(person));
        assertNotNull(personService.getAll());
    }

    @Test
    void update() {
        when(personRepository.save(person)).thenReturn(person);
        personService.update(person);
    }

    @Test
    void getOne() {
        when(personRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(person));
        assertNotNull(personService.getOne(1L));
    }

    @Test
    void delete() {
        when(personRepository.findById(person.getId())).thenReturn(Optional.of(person));
        personService.delete(person);
    }
}