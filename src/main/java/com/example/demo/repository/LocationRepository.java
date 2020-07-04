package com.example.demo.repository;

import com.example.demo.models.Location;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
