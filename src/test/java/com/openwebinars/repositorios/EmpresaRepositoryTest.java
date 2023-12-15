/*
package com.openwebinars.repositorios

import com.openwebinars.spring.example.demo.entity.Empresa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import com.openwebinars.spring.example.demo.repositorios.EmpresaRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Indiquem que es un test, i que s'enfoqui en els repositoris JPA.
@DataJpaTest

class EmpresaRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    //SUT (System under test)
    @Autowired
    //private EmpresaRepository repository;


    @BeforeEach
    void setUp() {

    }

    // private Empresa insertDemoEmpresa(Empresa empresa){
    //     entityManager.persist(empr);
    //     entityManager.flush();
    //    return empr;
    //}



    @Test
    @Sql("empre.sql")
    void findAllWithSql() {
        List<Empresa> empre = repository.findAll();
        assertEquals(2, empre.size());
    }



    //@Test
    //@SqlGroup( value = {
    //        @Sql("empre.sql"),
    //        @Sql("elquesigui.sql")}
    //)
    //void findAllWithSqlGroup() {
    //    List<Empresa> empre = repository.findAll();
    //   assertEquals(4, empre.size());
    //}



    //@Test
    //void findAllByEmpresa(){
    //Empresa empr = new Empresa("Balenciaga", "Free", "Buenas", "Barcelona Bonita");
    //  Empresa empr = insertDemoEmpresa(empr);
    //  List<Empresa> empre = repository.findAllByEmpresa("ITICBCN");
    //  assertEquals(1,empre.size());
    //  assertEquals(1L,empre.get(0).getId());
    //}



    @Test
    void findAllByName() {

    }
}*/
