package co.com.n5.user.admin.service;


import co.com.n5.user.admin.model.Gender;
import co.com.n5.user.admin.repository.GenderRepository;
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

class GenderServiceTest {

    @Mock
    private GenderRepository genderRepository;

    @InjectMocks
    private GenderService genderService;

    private Gender gender;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        gender = new Gender();
        gender.setId(1L);
        gender.setDescription("DocumentType 1");
        gender.setName("DocumentType 1");
    }

    @Test
    void create() {
        when(genderRepository.save(gender)).thenReturn(gender);
        assertNotNull(genderService.create(gender));
    }

    @Test
    void getAll() {
        when(genderRepository.findAll()).thenReturn(Arrays.asList(gender));
        assertNotNull(genderService.getAll());
    }

    @Test
    void update() {
        when(genderRepository.save(gender)).thenReturn(gender);
        genderService.update(gender);
    }

    @Test
    void getOne() {
        when(genderRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(gender));
        assertNotNull(genderService.getOne(1L));
    }

    @Test
    void delete() {
        when(genderRepository.findById(gender.getId())).thenReturn(Optional.of(gender));
        genderService.delete(gender);
    }
}