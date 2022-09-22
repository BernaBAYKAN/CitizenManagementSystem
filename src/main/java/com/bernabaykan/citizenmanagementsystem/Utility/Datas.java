package com.bernabaykan.citizenmanagementsystem.Utility;

import com.bernabaykan.citizenmanagementsystem.Repository.IChildrenRepository;
import com.bernabaykan.citizenmanagementsystem.Repository.ICitizenRepository;
import com.bernabaykan.citizenmanagementsystem.Repository.entity.Children;
import com.bernabaykan.citizenmanagementsystem.Repository.entity.Citizen;
import com.bernabaykan.citizenmanagementsystem.dto.request.DrivingRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Datas {

    private final ICitizenRepository citizenRepository;
    private final IChildrenRepository childrenRepository;

     @PostConstruct
    public void DatasCreate() {
      createCitizenList();
      createChildrenLis();
    }

    private void createChildrenLis(){
        /**
         *     "Mike Smith": 123457,
         *     "Jessica Smith": 123458,
         *     "Sarah Smith": 123459
         */
        childrenRepository.save(Children.builder()
                .name("Mike Smith")
                .parentId(1L)
                .build());
        childrenRepository.save(Children.builder()
                .name("Jessica Smith")
                .parentId(1L)
                .build());
        childrenRepository.save(Children.builder()
                .name("Sarah Smith")
                .parentId(1L)
                .build());
        /**
         * "Sarah Bloggs": 123463
         */
        childrenRepository.save(Children.builder()
                .name("Sarah Bloggs")
                .parentId(3L)
                .build());
    }
    private void createCitizenList() {

        citizenRepository.save(Citizen.builder()
                .name("John Smith")
                .isCitizen(true)
                .hasDrivingLicense(true)
                .build());
        citizenRepository.save(Citizen.builder()
                .name("Michael Tall")
                .isCitizen(false)
                .hasDrivingLicense(false)
                .build());
        citizenRepository.save(Citizen.builder()
                .name("Joe Bloggs")
                .isCitizen(false)
                .hasDrivingLicense(true)
                .build());

    }

}
