package co.edu.javeriana.as.personapp.mariadb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.javeriana.as.personapp.mariadb.entity.EstudiosEntity;

public interface EstudiosRepositoryMaria extends JpaRepository<EstudiosEntity, Integer>{
}
