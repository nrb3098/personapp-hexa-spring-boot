package co.edu.javeriana.as.personapp.application.usecase;

import co.edu.javeriana.as.personapp.application.port.in.TelefonoInputPort;
import co.edu.javeriana.as.personapp.application.port.out.TelefonoOutputPort;

import java.util.List;

public class TelefonoUseCase implements TelefonoInputPort {
    public void setPersistence(TelefonoOutputPort phonePersistence) {

    }
    @Override
    public Phone create(Phone phone) {
        return null;
    }
    @Override
    public Phone edit(String number, Phone phone) throws NoExistException {
        return null;
    }
    @Override
    public Boolean drop(String number) throws NoExistException {
        return null;
    }
    @Override
    public List<Phone> findAll() {
        return null;
    }
    @Override
    public Phone findOne(String number) throws NoExistException {
        return null;
    }
    @Override
    public Integer count() {
        return null;
    }
    @Override
    public Person getOwner(String number) throws NoExistException {
        return null;
    }
}
