package repository;

import java.util.HashMap;
import java.util.logging.Logger;

import com.automation.services.LogService;

import io.cucumber.java.es.*;
import packages.function.*;
import packages.sandbox.LoginPractice;

public class LogSteps {

    private Logger logger = LogService.getLogger();
    
    private ArithmeticFunctions fnArithmetic = new ArithmeticFunctions();
    private StringOrdenation strUtils = new StringOrdenation();
    private LoginPractice moduleLogin = new LoginPractice();
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

    @Dado("el aplicativo de inicio de sesión")
    public void el_aplicativo_de_inicio_de_sesión() {
        // Write code here that turns the phrase above into concrete actions
        // code magic's
    }

    @Cuando("se configura el usuario {string}")
    public void se_configura_el_usuario(String user) {
        dataStorage.put("user_login", user);
        logger.config("stored data: " + user);
    }

    @Entonces("verifico el inicio de sesión del usuario")
    public void verifico_el_inicio_de_sesión_del_usuario() {
        moduleLogin.loginUser((String) dataStorage.get("user_login"));
    }

    @Dado("muestro logs {string}")
    public void muestro_logs(String s) {
        logger.info(s);
    }
}
