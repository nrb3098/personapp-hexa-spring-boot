package co.edu.javeriana.as.personapp.application.usecase;

import co.edu.javeriana.as.personapp.application.port.in.ProfesionInputPort;
import co.edu.javeriana.as.personapp.application.port.out.ProfesionOutputPort;

import java.util.List;

public class ProfesionUseCase implements ProfesionInputPort {
    public void setPersistence(ProfesionOutputPort professionPersistence) {

    }
    @Override
    public Profession create(Profession profession) {
        return null;
    }
    @Override
    public Profession edit(Integer identification, Profession profession) throws NoExistException {
        return null;
    }
    @Override
    public Boolean drop(Integer identification) throws NoExistException {
        return null;
    }
    @Override
    public List<Profession> findAll() {
        return null;
    }
    @Override
    public Profession findOne(Integer identification) throws NoExistException {
        return null;
    }
    @Override
    public Integer count() {
        return null;
    }
    @Override
    public List<Study> getStudies(Integer identification) throws NoExistException {
        return null;
    }
}
