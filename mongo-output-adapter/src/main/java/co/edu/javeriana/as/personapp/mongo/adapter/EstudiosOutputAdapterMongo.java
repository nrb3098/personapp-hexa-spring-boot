package co.edu.javeriana.as.personapp.mongo.adapter;

import co.edu.javeriana.as.personapp.application.port.out.EstudiosOutputPort;
import co.edu.javeriana.as.personapp.common.annotations.Adapter;
import co.edu.javeriana.as.personapp.domain.Study;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
@Adapter("estudiosOutputAdapterMongo")
public class EstudiosOutputAdapterMongo implements EstudiosOutputPort {
    @Override
    public Study save(Study study) {
        return null;
    }

    @Override
    public Boolean delete(Integer identification) {
        return null;
    }

    @Override
    public List<Study> find() {
        return null;
    }

    @Override
    public Study findById(Integer identification) {
        return null;
    }
}
