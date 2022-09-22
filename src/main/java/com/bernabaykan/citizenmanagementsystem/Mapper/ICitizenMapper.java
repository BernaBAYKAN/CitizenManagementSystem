package com.bernabaykan.citizenmanagementsystem.Mapper;

import com.bernabaykan.citizenmanagementsystem.Repository.entity.Citizen;
import com.bernabaykan.citizenmanagementsystem.dto.request.DrivingRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICitizenMapper {
    ICitizenMapper INSTANCE = Mappers.getMapper(ICitizenMapper.class);

    Citizen toCitizen(DrivingRequestDto dto);

}
