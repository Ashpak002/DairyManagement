package com.dairyManagement.dairy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String farmername;
    private int code;
    private String farmermobilenumber;
    private String farmeranimal;
    private String farmeraddress;
    private String farmergender;

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFarmername() {
        return farmername;
    }

    public void setFarmername(String farmername) {
        this.farmername = farmername;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFarmermobilenumber() {
        return farmermobilenumber;
    }

    public void setFarmermobilenumber(String farmermobilenumber) {
        this.farmermobilenumber = farmermobilenumber;
    }

    public String getFarmeranimal() {
        return farmeranimal;
    }

    public void setFarmeranimal(String farmeranimal) {
        this.farmeranimal = farmeranimal;
    }

    public String getFarmeraddress() {
        return farmeraddress;
    }

    public void setFarmeraddress(String farmeraddress) {
        this.farmeraddress = farmeraddress;
    }

    public String getFarmergender() {
        return farmergender;
    }

    public void setFarmergender(String farmergender) {
        this.farmergender = farmergender;
    }
}
