package com.conclusion.transparencyPortalService.repository;

import com.conclusion.transparencyPortalService.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
}


