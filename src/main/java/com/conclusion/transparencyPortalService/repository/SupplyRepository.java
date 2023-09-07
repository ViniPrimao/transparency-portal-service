package com.conclusion.transparencyPortalService.repository;

import com.conclusion.transparencyPortalService.entity.SupplyEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRepository extends MongoRepository<SupplyEntity, String> {
}
