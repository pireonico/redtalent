package src.redtalent.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;
import src.redtalent.security.UserAccount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Document(collection = "Users")
public class User extends Actor{

    private String role;

    public User(){
        super();
    }


    private AcademicProfile academicProfile;
    private List<Application> applications;

    public User(String email, String name,String surname, boolean isSuspicious, UserAccount userAccount, String role,AcademicProfile academicProfile,List<Application> applications) {
        super(email, name,surname, isSuspicious, userAccount);
        this.role = role;
        this.academicProfile = academicProfile;
        this.applications = applications;
    }

    @NotBlank
    @Pattern(regexp = "^STUDENT|GRADUATE|PROFESSOR$")
    public String getRole(){
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Valid
    public AcademicProfile getAcademicProfile() {
        return academicProfile;
    }

    public void setAcademicProfile(AcademicProfile academicProfile) {
        this.academicProfile = academicProfile;
    }

    @Valid
    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }


}
