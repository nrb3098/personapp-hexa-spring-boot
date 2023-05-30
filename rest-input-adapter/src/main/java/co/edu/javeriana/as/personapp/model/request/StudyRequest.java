package co.edu.javeriana.as.personapp.model.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudyRequest {
    private String idProfession;
    private String idPerson;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate graduationDate;
    private String universityName;
    private String database;
}
