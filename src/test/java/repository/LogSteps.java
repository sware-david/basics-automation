package repository;

import io.cucumber.java.es.*;

public class LogSteps {
    @Dado("una prueba automatizada que utiliza registros {int}")
    public void una_prueba_automatizada_que_utiliza_registros(Integer int1) {
        System.out.println("Iniciando prueba automatizada con registros: " + int1);
    }
}
