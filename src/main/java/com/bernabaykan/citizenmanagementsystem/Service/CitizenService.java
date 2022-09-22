package com.bernabaykan.citizenmanagementsystem.Service;

import com.bernabaykan.citizenmanagementsystem.Mapper.ICitizenMapper;
import com.bernabaykan.citizenmanagementsystem.Repository.ICitizenRepository;
import com.bernabaykan.citizenmanagementsystem.Repository.entity.Citizen;
import com.bernabaykan.citizenmanagementsystem.Utility.ServiceManager;
import com.bernabaykan.citizenmanagementsystem.dto.request.DrivingRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitizenService extends ServiceManager<Citizen,Long> {

    private final ICitizenRepository citizenRepository;

    public CitizenService(ICitizenRepository citizenRepository) {
        super(citizenRepository);
        this.citizenRepository = citizenRepository;
    }

    public List<Citizen>  findByHasDrivingLicense(DrivingRequestDto dto){
       List<Citizen> citizen = citizenRepository.findByHasDrivingLicense(dto.isHasDrivingLicense());
        return citizen;
    }

}
