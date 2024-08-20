package com.mAnu.dating_ai_backend.conversations.entity;

import java.time.LocalDateTime;

public record ChatMessage(
                String textMessage,
                String profileId,
                LocalDateTime messageTime) {
}
