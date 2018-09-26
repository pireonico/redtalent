package src.redtalent.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Document(collection = "Teams")
public class Team {

    private String name;
    private String description;
    private Date finishRegistration;
    private Integer participants;

    public Team(){
        super();
    }

    private List<Application> applications;
    private List<Project> projects;

    public Team(String name, String description, Date finishRegistration, Integer participants, List<Application> applications,List<Project> projects){
        this.name = name;
        this.description = description;
        this.finishRegistration = finishRegistration;
        this.participants = participants;
        this.applications = applications;
        this.projects = projects;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @NotBlank
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull
    @Future
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    public Date getFinishRegistration() {
        return finishRegistration;
    }

    public void setFinishRegistration(Date finishRegistration) {
        this.finishRegistration = finishRegistration;
    }

    @NotBlank
    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
