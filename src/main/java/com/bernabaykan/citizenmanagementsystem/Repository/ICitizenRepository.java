package com.bernabaykan.citizenmanagementsystem.Repository;

import com.bernabaykan.citizenmanagementsystem.Repository.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ICitizenRepository extends JpaRepository<Citizen,Long> {
    List<Citizen> findByHasDrivingLicense(boolean hasDrivingLicense);
    List<Citizen> findByNameAndNumberofchildren(String name, int numberofchildren);

}
