package com.example.codeclan.filesharing.components;

import com.example.codeclan.filesharing.models.File;
import com.example.codeclan.filesharing.models.Folder;
import com.example.codeclan.filesharing.models.User;
import com.example.codeclan.filesharing.repositories.FileRepository;
import com.example.codeclan.filesharing.repositories.FolderRepository;
import com.example.codeclan.filesharing.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;



    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("Gordon");
        userRepository.save(user1);
        User user2 = new User("Jim");
        userRepository.save(user2);
        User user3 = new User("Gill");
        userRepository.save(user3);
        User user4 = new User("Sam");
        userRepository.save(user4);

        Folder folder1 = new Folder("root");
        folderRepository.save(folder1);
        Folder folder2 = new Folder("home");
        folderRepository.save(folder2);

        folder1.addUser(user1);
        folder1.addUser(user2);
        folder1.addUser(user3);
        folderRepository.save(folder1);

        folder2.addUser(user2);
        folder2.addUser(user3);
        folder2.addUser(user4);
        folderRepository.save(folder2);

        File file1 = new File("photo","jpg",250, folder1);
        fileRepository.save(file1);
        File file2 = new File("image","gif",145, folder1);
        fileRepository.save(file2);
        File file3 = new File("cv","doc",65, folder2);
        fileRepository.save(file3);
        File file4 = new File("readme","txt",5, folder2);
        fileRepository.save(file4);
        File file5 = new File("my taxes","xls",250, folder2);
        fileRepository.save(file5);
        File file6 = new File("my story","doc",1000, folder1);
        fileRepository.save(file6);
        File file7 = new File("shopping list","xls",300, folder1);
        fileRepository.save(file7);
    }

}
