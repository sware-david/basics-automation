#language:es
@logging
Característica: Uso de los registros en las pruebas automatizadas

    @log-001
    Esquema del escenario: Prueba automatizada con registros
        Dado una prueba automatizada que utiliza registros <ejemplo>

        Ejemplos:
            | ejemplo |
            | 10      |
            | 8       |
            | 9       |
            | 15      |
    
    @log-002
    Esquema del escenario: Prueba automatizada de ordenamiento
        Dados los datos para ordenar "<datos>"
        Entonces ordenamos los numeros de forma ascendente

        Ejemplos:
            | datos     |
            | 191320123 |
            | 1545      |

    @log-003
    Esquema del escenario: Prueba automatizada con registros para login
        Dado el aplicativo de inicio de sesión
        Cuando se configura el usuario "<username>"
        Entonces verifico el inicio de sesión del usuario

        Ejemplos:
            | username    |
            | akeywood0   |
            | rsurmeyer1  |
            | rhagerty2   |
            | khackelton3 |
            | apeggrem4   |
            | aratledge5  |
            | fhuddart6   |
            | cocorr7     |
            | hcicetti8   |
            | fdawks9     |
