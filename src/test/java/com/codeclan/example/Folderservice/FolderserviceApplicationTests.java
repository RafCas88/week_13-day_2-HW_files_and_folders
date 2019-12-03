package com.codeclan.example.Folderservice;

import com.codeclan.example.Folderservice.models.File;
import com.codeclan.example.Folderservice.models.Folder;
import com.codeclan.example.Folderservice.models.User;
import com.codeclan.example.Folderservice.repositories.FileRepository;
import com.codeclan.example.Folderservice.repositories.FolderRepository;
import com.codeclan.example.Folderservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FolderserviceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolderAndUser(){
		User user = new User("raf");
		userRepository.save(user);

		Folder folder = new Folder("codeclan", user);
		folderRepository.save(folder);

		File file = new File("hello", "world", folder);
		fileRepository.save(file);

	}

}
