package com.dairyManagement.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dairyManagement.dairy.entity.Farmer;
import com.dairyManagement.dairy.services.FarmerService;
import com.dairyManagement.dairy.services.FarmerServiceImp;

@Controller
public class DairyController {
    
    @Autowired
    private FarmerService farmerService;
    
    @GetMapping("/homepage")
    public String home() {
        return "homepage";
    }
    
    @GetMapping("/add_new_member")
    public String addNewMember(Model model) {
        model.addAttribute("addNewMember", new Farmer());
        return "addNewMember";
    }
    
    @GetMapping("/milk_collection")
    public String milkcollection() {
        return "milkcollection";
    }
    
    @GetMapping("/display_all_members")
    public String displayAllMembers() {
        return "displayAllMembers";
    }
    
    @GetMapping("/rate_chart")
    public String rateChart() {
        return "rateChart";
    }
    
    @GetMapping("/generate_bill")
    public String generateBill() {
        return "generateBill";
    }
    
    @GetMapping("/feed_section")
    public String feedSection() {
        return "feedSection";
    }
    
    

    @GetMapping("/addNewMember")
    public String showAddNewMemberForm(Model model) {
        model.addAttribute("farmer", new Farmer());
        return "addNewMember";  // This should match the name of your template file
    }

    @PostMapping("/save")
    public String saveFarmer(Farmer farmer, Model model) {
        farmerService.saveFarmer(farmer);
        model.addAttribute("message", "Farmer saved successfully");
        return "success";  // Assuming you have a success.html page
    }
    }
