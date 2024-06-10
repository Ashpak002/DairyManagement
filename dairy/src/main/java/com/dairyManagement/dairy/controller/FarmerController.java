package com.dairyManagement.dairy.controller;

import com.dairyManagement.dairy.entity.Farmer;
import com.dairyManagement.dairy.services.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/farmer")  // Add a unique prefix
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    // Method to render the form
    @GetMapping("/addNewMember")
    public String showAddNewMemberForm(Model model) {
        model.addAttribute("farmer", new Farmer());  // Add a new Farmer object to the model
        return "addNewMember";  // The template name
    }

    @PostMapping("/save")
    public String saveFarmer(Farmer farmer, Model model) {
        farmerService.saveFarmer(farmer);
        model.addAttribute("message", "Farmer saved successfully");
        return "success";  // Assuming you have a success.html page
    }
}
