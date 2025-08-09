package repository;

import java.util.HashMap;
import java.util.logging.Logger;

import com.automation.services.LogService;

import io.cucumber.java.es.*;
import packages.function.*;

public class LogSteps {

    private Logger logger = LogService.getLogger();
    
    private ArithmeticFunctions fnArithmetic = new ArithmeticFunctions();
    private StringOrdenation strUtils = new StringOrdenation();
    HashMap<String,Object> dataStorage = new HashMap<>();

    @Dado("una prueba automatizada que utiliza registros {int}")
    public void una_prueba_automatizada_que_utiliza_registros(Integer number) {
        fnArithmetic.checkNumberProperties(number);
    }

    @Dados("los datos para ordenar {string}")
    public void los_datos_para_ordenar(String data) {
        dataStorage.put("order_data", data);
    }
    
    @Entonces("ordenamos los numeros de forma ascendente")
    public void ordenamos_los_numeros_de_forma_ascendente() {
        String dataOrdered = strUtils.orderNumbers((String) dataStorage.get("order_data"));
        logger.info("sorted data: " + dataOrdered);
    }
}
