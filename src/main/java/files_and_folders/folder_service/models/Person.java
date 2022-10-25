package files_and_folders.folder_service.models;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {



    @Column(name = "name")
    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "person" , fetch = FetchType.LAZY)
    private List<Folder> folders;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    public Person(String name){
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }

    public Person(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
