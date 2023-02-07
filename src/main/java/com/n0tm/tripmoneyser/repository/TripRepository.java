package com.n0tm.tripmoneyser.repository;

import com.n0tm.tripmoneyser.entity.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TripRepository extends JpaRepository<TripEntity, UUID> {
}