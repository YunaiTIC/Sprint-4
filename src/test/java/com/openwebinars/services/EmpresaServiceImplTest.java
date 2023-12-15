/*
package com.openwebinars.services;

import com.openwebinars.spring.example.demo.entity.Empresa;
import com.openwebinars.spring.example.demo.repositorios.EmpresaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.openwebinars.spring.services.EmpresaServiceImpl;

import java.util.List;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static reactor.core.publisher.Mono.when;


class EmpresaServiceImplTest {

    //System under test

    Empresa empresaService;
    //Dependencias
    @Mock
    EmpresaRepository empresaRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        empresaService = new EmpresaServiceImpl(empresaRepository);

    }

    @Test
    void findAll() {

        //Configurem Mock
        when(empresaRepository.findAll()).thenReturn(List.of());

        //Executar el comportament a testejar
        List<Empresa> empresas = empresaService.findAll();

        //Comprovacions JUnits
        assertNotNull(empresas);
        assertEquals(0,empresas.size());

        //Verificacions mockito
        verify(empresaRepository,times(1)).findAll();

    }

    @Test
    void findById() {
    }
}
*/
