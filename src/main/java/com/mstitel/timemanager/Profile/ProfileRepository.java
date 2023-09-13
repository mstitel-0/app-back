package com.mstitel.timemanager.Profile;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProfileRepository extends MongoRepository<Profile, ObjectId> {
    Optional<Profile> findById(ObjectId id);

    Optional<Profile> findByUserId(ObjectId id);
}
