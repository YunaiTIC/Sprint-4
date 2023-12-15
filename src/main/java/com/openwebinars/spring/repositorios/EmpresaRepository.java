package com.openwebinars.spring.repositorios;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.openwebinars.spring.entity.Empresa;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    // Métodos CRUD proporcionados por JpaRepository
}





  /*  // Consultas básicas
    Optional<Empresa> findByName(String name);

    //Queries con JSQL

    @Query(value = "SELECT e FROM Empresa e JOIN Ofertes o WHERE e.name IN :name")
    List<Empresa> findByName(@Param("name") List<Integer> nombres);
    // List<Empresa> findByAgeInQuery(List<Integer> nombres);

    @Query("""
        SELECT CASE WHEN COUNT(e) > 0 THEN true ELSE false END
        FROM Empresa e
        WHERE lower(e.name) LIKE lower(:name)
    """)
    boolean existsByNameIgnoreCase(@Param("name") String name);



    //Queries con SQL nativo
    @Query(value = "SELECT * FROM empresa e WHERE e.name = ITIC ", nativeQuery = true)
    List<Empresa> findAlLByName();

    @Transactional
    @Modifying
    @Query("UPDATE Empresa e SET e.location = 'Madrid' WHERE e.location != :barcelona")
    void updateLocation(@Param("barcelona") String barcelona);*/



