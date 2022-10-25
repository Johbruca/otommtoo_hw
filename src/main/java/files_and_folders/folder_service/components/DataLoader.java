package files_and_folders.folder_service.components;


import files_and_folders.folder_service.models.File;
import files_and_folders.folder_service.models.Folder;
import files_and_folders.folder_service.models.Person;
import files_and_folders.folder_service.repositories.PersonRepository;
import files_and_folders.folder_service.repositories.FolderRepository;
import files_and_folders.folder_service.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args) {


        Person frank = new Person("Frank Jones");
        personRepository.save(frank);

        Person brian = new Person("Brian Way");
        personRepository.save(brian);

        Folder folder1 = new Folder("Hello World", frank);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("What's good, yo", brian);
        folderRepository.save(folder2);

        File file1 = new File("Intro", ".java", 2, folder1);
        fileRepository.save(file1);

        File file2 = new File("Instructions", ".javascript", 3, folder1);
        fileRepository.save(file2);

        File file3 = new File("Exercise", ".py", 1, folder2);
        fileRepository.save(file3);

        File file4 = new File("Conclusion", ".html", 1, folder2);
        fileRepository.save(file4);

    }
}
