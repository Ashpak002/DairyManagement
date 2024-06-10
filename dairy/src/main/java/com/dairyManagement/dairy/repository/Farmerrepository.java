package com.dairyManagement.dairy.repository;

import com.dairyManagement.dairy.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Farmerrepository extends JpaRepository<Farmer, Integer> {
}
