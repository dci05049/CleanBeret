package com.example.springsocial;

import com.example.springsocial.config.AppProperties;
import com.example.springsocial.model.AuthProvider;
import com.example.springsocial.model.User;
import com.example.springsocial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringSocialApplication {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSocialApplication.class, args);
	}
//
//	@Bean
//	CommandLineRunner runner(UserRepository repository) {
//		return args -> {
//			User user = new User();
//			user.setName("Test user");
//			user.setEmail("jyjason.junggil@gmail.com");
//			user.setPassword("password");
//			user.setProvider(AuthProvider.local);
//
//			user.setPassword(passwordEncoder.encode(user.getPassword()));
//			User result = repository.insert(user);
//		};
//	}
}
