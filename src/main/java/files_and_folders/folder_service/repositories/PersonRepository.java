package files_and_folders.folder_service.repositories;

import files_and_folders.folder_service.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {




}
