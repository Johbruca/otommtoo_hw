package files_and_folders.folder_service.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder implements Serializable {

    @Column(name = "title")
    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({ "person" })
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @JsonBackReference
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private List<File> files;


    public Folder(String title, Person person) {
        this.title = title;
        this.person = person;
        this.files = new ArrayList<File>();
    }

    public Folder(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
