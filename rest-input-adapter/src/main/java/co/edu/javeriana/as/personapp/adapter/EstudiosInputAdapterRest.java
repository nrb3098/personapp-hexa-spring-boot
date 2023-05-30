package co.edu.javeriana.as.personapp.adapter;

import co.edu.javeriana.as.personapp.mapper.PersonaMapperRest;

public class EstudiosInputAdapterRest {

    @Autowired
    @Qualifier("EstudiosOutputAdapterMaria")
    private PersonOutputPort personOutputPortMaria;

    @Autowired
    @Qualifier("EstudiosOutputAdapterMongo")
    private PersonOutputPort personOutputPortMongo;

    @Autowired
    private PersonaMapperRest personaMapperRest;

    PersonInputPort personInputPort;
}
