package co.edu.javeriana.as.personapp.application.usecase;

import co.edu.javeriana.as.personapp.application.port.in.EstudiosInputPort;
import co.edu.javeriana.as.personapp.application.port.out.EstudiosOutputPort;

import java.util.List;

public class EstudioUseCase implements EstudiosInputPort {
    public void setPersistence(EstudiosOutputPort studyPersistence) {

    }
    @Override
    public Study create(Study study) {
        return null;
    }
    @Override
    public Study edit(Integer professionID, Integer personID, Study study) throws NoExistException {
        return null;
    }
    @Override
    public Boolean drop(Integer professionID, Integer personID) throws NoExistException {
        return null;
    }
    @Override
    public List<Study> findAll() {
        return null;
    }
    @Override
    public Study findOne(Integer professionID, Integer personID) throws NoExistException {
        return null;
    }
    @Override
    public Integer count() {
        return null;
    }
    @Override
    public Person getPerson(Integer professionID, Integer personID) throws NoExistException {
        return null;
    }
    @Override
    public Profession getProfession(Integer professionID, Integer personID) throws NoExistException {
        return null;
    }
}
