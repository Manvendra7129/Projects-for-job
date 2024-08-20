package com.mAnu.dating_ai_backend;

import com.mAnu.dating_ai_backend.conversations.entity.ChatMessage;
import com.mAnu.dating_ai_backend.conversations.entity.Conversation;
import com.mAnu.dating_ai_backend.conversations.repository.ConversationRepository;
import com.mAnu.dating_ai_backend.profiles.entity.Gender;
import com.mAnu.dating_ai_backend.profiles.entity.Profile;
import com.mAnu.dating_ai_backend.profiles.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DatingAiBackendApplication implements CommandLineRunner {
	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private ConversationRepository conversationRepository;

	public static void main(String[] args) {
		SpringApplication.run(DatingAiBackendApplication.class, args);
	}

	public void run(String... args) {
		profileRepository.deleteAll();
		conversationRepository.deleteAll();
		Profile profile = new Profile(
				"1",
				"manu",
				"raj",
				25,
				"Indian",
				Gender.MALE,
				" I am devloper",
				"img.jpg",
				"Inpt"

		);

		profileRepository.save(profile);
		profile = new Profile(
				"2",
				"vijay",
				"raj",
				27,
				"Indian",
				Gender.MALE,
				" I am devloper",
				"img2.jpg",
				"Inpt"

		);
		profileRepository.save(profile);
		profileRepository.findAll().forEach(System.out::println);

		Conversation conversation = new Conversation("1", profile.id(), List.of(
				new ChatMessage("Hello", profile.id(), LocalDateTime.now())));
		conversationRepository.save(conversation);
		conversationRepository.findAll().forEach(System.out::println);

	}
}
