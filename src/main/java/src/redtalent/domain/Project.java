package src.redtalent.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Document(collection = "Projects")
public class Project {

    private String name;
    private  String description;
    private String requiredProfiles;
    private Integer maxParticipants;
    public String complexity;
    private Date startDate;
    private Date finishDate;
    private String attachedFiles;

    public Project(){
        super();
    }

    public Project(String name, String description, String requiredProfiles, Integer maxParticipants,String complexity, Date startDate, Date finishDate, String attachedFiles){
        this.name = name;
        this.description = description;
        this.requiredProfiles = requiredProfiles;
        this.maxParticipants = maxParticipants;
        this.complexity = complexity;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.attachedFiles = attachedFiles;
    }

    @NotBlank
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank
    @Pattern(regexp = "^HIGH|LOW|MEDIUM$")
    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    @NotBlank
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequiredProfiles() {
        return requiredProfiles;
    }

    public void setRequiredProfiles(String requiredProfiles) {
        this.requiredProfiles = requiredProfiles;
    }

    @Size(min = 1)
    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @NotNull
    @Future
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @NotNull
    @Future
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getAttachedFiles() {
        return attachedFiles;
    }

    public void setAttachedFiles(String attachedFiles) {
        this.attachedFiles = attachedFiles;
    }
}
