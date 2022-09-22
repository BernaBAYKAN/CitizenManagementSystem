package com.bernabaykan.citizenmanagementsystem.Controller;

import com.bernabaykan.citizenmanagementsystem.Repository.entity.Children;
import com.bernabaykan.citizenmanagementsystem.Service.ChildrenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.bernabaykan.citizenmanagementsystem.Constants.Apis.*;

@Controller
@RequestMapping(VERSION+ API + CHILDREN)
@RequiredArgsConstructor
public class ChildrenController {

    private final ChildrenService childrenService;

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Children>> getAllChildren(){
        return ResponseEntity.ok(childrenService.findAll());
    }
}
