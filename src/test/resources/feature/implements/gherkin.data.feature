#language:es
@data @data-security
Característica: Buenas prácticas en la implementación de Gherkin - Datos

    # Un escenario que funciona... NO ES suficiente, ES DEFICIENTE
    # Errores:
    # - Duplicidad de datos entre features (no centralizados)
    # - Datos no ofuscados o datos sensibles en duro (SEGURIDAD!!!!!)
    #   *es nuestra responsabilidad usar correctamente los datos y protegerlos
    # - Variación entre referencias de los mismos datos (no unificados)

    Escenario: Escenario de Datos
        Cuando muestro logs "data scenario"
