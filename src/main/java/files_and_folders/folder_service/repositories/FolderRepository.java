package files_and_folders.folder_service.repositories;

import files_and_folders.folder_service.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
