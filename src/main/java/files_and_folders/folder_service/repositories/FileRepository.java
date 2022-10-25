package files_and_folders.folder_service.repositories;

import files_and_folders.folder_service.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
