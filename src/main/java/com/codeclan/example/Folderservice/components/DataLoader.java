package com.codeclan.example.Folderservice.components;

import com.codeclan.example.Folderservice.models.File;
import com.codeclan.example.Folderservice.models.Folder;
import com.codeclan.example.Folderservice.models.User;
import com.codeclan.example.Folderservice.repositories.FileRepository;
import com.codeclan.example.Folderservice.repositories.FolderRepository;
import com.codeclan.example.Folderservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User raf = new User("Raf");
        userRepository.save(raf);

        User silvia = new User("silvia");
        userRepository.save(silvia);

        Folder codeclan = new Folder("codeclan", raf);
        folderRepository.save(codeclan);

        Folder codebase = new Folder("codebase", silvia);
        folderRepository.save(codebase);

        File file1 = new File("hello", "world", codeclan);
        fileRepository.save(file1);

        File file2 = new File("ciao", "mondo", codebase);
        fileRepository.save(file2);


    }


}
