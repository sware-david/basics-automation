#language:es
@structure
Característica: Buenas prácticas en la implementación de Gherkin specifications - Redacción o Escritura

    # Un escenario que funciona... NO ES suficiente, ES DEFICIENTE
    # Errores: 
    # - Contiene excesivos parámetros
    # - Contiene duplicidad de llamados de variable
    # - Manda valores que nunca o casi nunca cambian por parámetros
    # - No tiene una redacción limpia (ortografia)
    # - Mal uso de los Keyboar

@data @data-security
Característica: Buenas prácticas en la implementación de Gherkin - Datos

    # Un escenario que funciona... NO ES suficiente, ES DEFICIENTE
    # Errores: 
    # - Duplicidad de datos entre features (no centralizados)
    # - Datos no ofuscados o datos sensibles en duro (SEGURIDAD!!!!!)
    #   *es nuestra responsabilidad usar correctamente los datos y protegerlos
    # - Variación entre referencias de los mismos datos (no unificados)

@structure-steps
Característica: Buenas prácticas en la implementación de Gherkin specifications - Estructura de pasos

    # Un escenario que funciona... NO ES suficiente, ES DEFICIENTE
    # Errores: 
    # - No saber cuando dividir o subdividir pasos en las pruebas
    #
