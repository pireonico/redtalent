package src.redtalent.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Document(collection = "Applications")
public class Application {

    private Date moment;
    private String status;

    public Application(){
        super();
    }

    public Application(Date moment, String status){
        this.moment = moment;
        this.status = status;
    }

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @NotBlank
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Application{" +
                "moment=" + moment +
                ", status='" + status + '\'' +
                '}';
    }
}
