package co.edu.javeriana.as.personapp.adapter;

import co.edu.javeriana.as.personapp.mapper.EstudiosMapperRest;
import co.edu.javeriana.as.personapp.mapper.PersonaMapperRest;

@Slf4j
@Adapter
public class EstudiosInputAdapterRest {

    @Autowired
    @Qualifier("EstudiosOutputAdapterMaria")
    private EstudiosOutputPort EstudiosOutputPortMaria;

    @Autowired
    @Qualifier("EstudiosOutputAdapterMongo")
    private EstudiosOutputPort EstudiosOutputPortMongo;

    @Autowired
    private EstudiosMapperRest EstudiosMapperRest;

    EstudiosInputPort EstudiosInputPort;
}
