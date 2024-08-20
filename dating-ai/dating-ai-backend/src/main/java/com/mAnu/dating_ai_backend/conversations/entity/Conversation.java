package com.mAnu.dating_ai_backend.conversations.entity;

import java.util.List;

public record Conversation(
                String id,
                String authorId,
                List<ChatMessage> messages

) {
}
