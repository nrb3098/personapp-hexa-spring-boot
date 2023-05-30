package co.edu.javeriana.as.personapp.adapter;


@Slf4j
@Adapter
public class TelefonoInputAdapterRest {
    @Autowired
    @Qualifier("TelefonoOutputAdapterMaria")
    private TelefonoOutputPort TelefonoOutputPortMaria;

    @Autowired
    @Qualifier("TelefonoOutputAdapterMongo")
    private TelefonoOutputPort TelefonoOutputPortMongo;

    @Autowired
    private TelefonoMapperRest TelefonoMapperRest;

    TelefonoInputPort TelefonoInputPort;
}
