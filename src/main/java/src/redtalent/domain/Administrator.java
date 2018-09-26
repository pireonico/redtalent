package src.redtalent.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import src.redtalent.security.UserAccount;

import javax.validation.constraints.NotNull;
import java.util.List;

@Document(collection = "Administrators")
public class Administrator extends Actor{

    public Administrator(){
        super();
    }

    @NotNull
    private List<Grade> grades;

    public Administrator(String email, String name,String surname, boolean isSuspicious, UserAccount userAccount, List<Grade> grades) {
        super(email, name,surname, isSuspicious, userAccount);
        this.grades = grades;
    }
    @NotNull
    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
