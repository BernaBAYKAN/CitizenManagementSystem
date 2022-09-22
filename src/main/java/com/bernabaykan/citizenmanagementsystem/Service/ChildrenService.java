package com.bernabaykan.citizenmanagementsystem.Service;

import com.bernabaykan.citizenmanagementsystem.Repository.IChildrenRepository;
import com.bernabaykan.citizenmanagementsystem.Repository.entity.Children;
import com.bernabaykan.citizenmanagementsystem.Utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ChildrenService extends ServiceManager<Children,Long> {

    private final IChildrenRepository childrenRepository;

    public ChildrenService(IChildrenRepository childrenRepository) {
        super(childrenRepository);
        this.childrenRepository = childrenRepository;
    }

}
