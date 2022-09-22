package com.bernabaykan.citizenmanagementsystem.Repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "citizen_table")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    boolean isCitizen;
    String name;
    boolean hasDrivingLicense;
    int numberofchildren;
    @Transient
    List<Children> childrenList;

}
