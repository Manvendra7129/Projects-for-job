package com.mAnu.dating_ai_backend.conversations.controller;

<<<<<<< HEAD
=======
import com.mAnu.dating_ai_backend.conversations.entity.ChatMessage;
>>>>>>> 27f588dd9a76ffd299644fda8278d08927d4ee2c
import com.mAnu.dating_ai_backend.conversations.entity.Conversation;
import com.mAnu.dating_ai_backend.conversations.entity.CreateNewConversationRequest;
import com.mAnu.dating_ai_backend.conversations.repository.ConversationRepository;
import com.mAnu.dating_ai_backend.profiles.repository.ProfileRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
>>>>>>> 27f588dd9a76ffd299644fda8278d08927d4ee2c
import java.util.UUID;

@RestController
public class ConversationController {
    private final ConversationRepository conversationRepository;
    private final ProfileRepository profileRepository;

    public ConversationController(ConversationRepository conversationRepository, ProfileRepository profileRepository) {
        this.conversationRepository = conversationRepository;
        this.profileRepository = profileRepository;
    }

    @PostMapping("/conversations")
    public Conversation createNewConversation(@RequestBody CreateNewConversationRequest request) {
        profileRepository.findById(request.profileId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Conversation conversation = new Conversation(UUID.randomUUID().toString(), request.profileId(),
                new ArrayList<>());
        conversationRepository.save(conversation);
        return conversation;
    }

}
