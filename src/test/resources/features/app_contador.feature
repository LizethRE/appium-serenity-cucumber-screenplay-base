#language: es
# Author: LizethRE
Característica: App Contador
  YO COMO usuario de la APP Material Design
  QUIERO ingresar a la funcionalidad App Contador
  PARA poder aumentar el contador

  @appContador
  Esquema del escenario: Aumento del contador de la funcionalidad App Contador
    Dado que Maria esta en la APP Material Design
    Cuando aumenta el contador a <cantidad>
    Entonces deberia visualizar la cantidad de pulsaciones realizadas en <cantidad>
    Ejemplos:
      | cantidad |
      | 3        |