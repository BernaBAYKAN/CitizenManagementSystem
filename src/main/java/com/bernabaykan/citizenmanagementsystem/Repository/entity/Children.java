package com.bernabaykan.citizenmanagementsystem.Repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "children_table")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String name;
    Long parentId;

}
