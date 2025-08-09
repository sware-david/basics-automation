#language:es
@logging
Característica: Uso de los registros en las pruebas automatizadas

    @log-001
    Escenario: Prueba automatizada con registros
        Dado una prueba automatizada que utiliza registros <ejemplo>

        Ejemplos:
            | ejemplo |
            | 10      |
            | 8       |
            | 9       |
            | 15      |
    
    @log-002
    Escenario: Prueba automatizada de ordenamiento
        Dados los datos para ordenar "<datos>"
        Entonces ordenamos los numeros de forma ascendente

        Ejemplos:
            | datos     |
            | 191320123 |
            | 1545      |
