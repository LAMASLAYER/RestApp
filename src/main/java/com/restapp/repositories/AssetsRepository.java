package com.restapp.repositories;

import com.restapp.models.Assets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetsRepository extends JpaRepository<Assets, Integer> {
}
