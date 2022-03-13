package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.Access;
import co.com.n5.user.admin.repository.AccessRepository;
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

class AccessServiceTest {

    @Mock
    private AccessRepository accessRepository;

    @InjectMocks
    private AccessService accessService;

    private Access access;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        access = new Access();
        access.setId(1L);
        access.setDescription("Access 1");
        access.setName("Access 1");
    }

    @Test
    void create() {
        when(accessRepository.save(access)).thenReturn(access);
        assertNotNull(accessService.create(access));
    }

    @Test
    void getAll() {
        when(accessRepository.findAll()).thenReturn(Arrays.asList(access));
        assertNotNull(accessService.getAll());
    }

    @Test
    void update() {
        when(accessRepository.save(access)).thenReturn(access);
        accessService.update(access);
    }

    @Test
    void getOne() {
        when(accessRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(access));
        assertNotNull(accessService.getOne(1L));
    }

    @Test
    void delete() {
        when(accessRepository.findById(access.getId())).thenReturn(Optional.of(access));
        accessService.delete(access);
    }
}