package com.mAnu.dating_ai_backend.conversations.repository;

import com.mAnu.dating_ai_backend.conversations.entity.Conversation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConversationRepository extends MongoRepository<Conversation, String> {

}
