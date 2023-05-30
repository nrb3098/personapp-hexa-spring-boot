package co.edu.javeriana.as.personapp.adapter;


import co.edu.javeriana.as.personapp.mapper.EstudiosMapperRest;

@Slf4j
@Adapter
public class ProfesionInputAdapterRest {

    @Autowired
    @Qualifier("ProfesionOutputAdapterMaria")
    private ProfesionOutputPort ProfesionOutputPortMaria;

    @Autowired
    @Qualifier("ProfesionOutputAdapterMongo")
    private ProfesionOutputPort ProfesionOutputPortMongo;

    @Autowired
    private ProfesionMapperRest ProfesionMapperRest;

    ProfesionInputPort ProfesionInputPort;
}
