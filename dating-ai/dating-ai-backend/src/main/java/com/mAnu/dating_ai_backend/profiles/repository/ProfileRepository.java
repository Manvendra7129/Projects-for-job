package com.mAnu.dating_ai_backend.profiles.repository;

import com.mAnu.dating_ai_backend.profiles.entity.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
