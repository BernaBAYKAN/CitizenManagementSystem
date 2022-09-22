package com.bernabaykan.citizenmanagementsystem.Controller;

import com.bernabaykan.citizenmanagementsystem.Repository.entity.Citizen;
import com.bernabaykan.citizenmanagementsystem.Service.CitizenService;
import com.bernabaykan.citizenmanagementsystem.Utility.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.bernabaykan.citizenmanagementsystem.Constants.Apis.*;

@Controller
@RequestMapping(VERSION+ API + CITIZEN)
@RequiredArgsConstructor
public class CitizenController {

    private final CitizenService citizenService;

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Citizen>> saveCitizen(){
       return ResponseEntity.ok(citizenService.findAll());
    }


}
