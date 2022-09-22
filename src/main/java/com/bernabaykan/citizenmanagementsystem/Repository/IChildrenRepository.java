package com.bernabaykan.citizenmanagementsystem.Repository;

import com.bernabaykan.citizenmanagementsystem.Repository.entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChildrenRepository extends JpaRepository<Children,Long> {

}
