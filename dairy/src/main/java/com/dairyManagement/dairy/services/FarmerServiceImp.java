package com.dairyManagement.dairy.services;

import com.dairyManagement.dairy.entity.Farmer;
import com.dairyManagement.dairy.repository.Farmerrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerServiceImp implements FarmerService {

    @Autowired
    private Farmerrepository farmerRepository;

    @Override
    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }
}
