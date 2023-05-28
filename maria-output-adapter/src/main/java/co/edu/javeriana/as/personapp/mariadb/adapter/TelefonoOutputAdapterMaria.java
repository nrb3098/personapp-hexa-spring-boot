package co.edu.javeriana.as.personapp.mariadb.adapter;


import co.edu.javeriana.as.personapp.application.port.out.TelefonoOutputPort;
import co.edu.javeriana.as.personapp.common.annotations.Adapter;
import co.edu.javeriana.as.personapp.domain.Phone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Adapter("TelefonoOutputAdapterMaria")
@Transactional
public class TelefonoOutputAdapterMaria implements TelefonoOutputPort {
    @Override
    public Phone save(Phone phone) {
        return null;
    }

    @Override
    public Boolean delete(Integer identification) {
        return null;
    }

    @Override
    public List<Phone> find() {
        return null;
    }

    @Override
    public Phone findById(Integer identification) {
        return null;
    }
}
