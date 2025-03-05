package dev.estate.RestatePro.repository;

import dev.estate.RestatePro.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<PropertyRepository> findByLocation(String location);
}
