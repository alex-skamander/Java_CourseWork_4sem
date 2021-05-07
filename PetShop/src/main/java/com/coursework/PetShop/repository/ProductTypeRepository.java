package com.coursework.PetShop.repository;

import com.coursework.PetShop.entity.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CrudRepository <ProductType, Long> {
}
