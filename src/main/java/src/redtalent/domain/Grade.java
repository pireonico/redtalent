package src.redtalent.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Grades")
public class Grade extends DomainEntity{

    @NotBlank
    private String name;
    @NotBlank
    private String university;

    public Grade(){
        super();
    }

    public Grade(String name, String university){
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
