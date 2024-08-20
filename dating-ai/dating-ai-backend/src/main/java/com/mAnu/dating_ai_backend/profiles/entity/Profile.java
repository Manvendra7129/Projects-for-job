package com.mAnu.dating_ai_backend.profiles.entity;

import com.mAnu.dating_ai_backend.profiles.entity.Gender;

public record Profile(
                String id,
                String firstName,
                String lastName,
                int age,
                String etnicity,
                Gender gender,
                String bio,
                String imageUrl,
                String myersBriggsPersonalityType) {

}
