package com.repository;

import com.entities.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<ReaderEntity, Integer> {
    ReaderEntity findByNameAndSurname(String name, String surname);
}
