#language: es
# Author: LizethRE
Característica: Date Picker Screen
  YO COMO usuario de la APP Material Design
  QUIERO ingresar a la funcionalidad Date Picker
  PARA poder interatuar con los componentes de Fecha y Hora

  @datePicker @date
  Esquema del escenario: Actualización de la fecha y hora en la funcionalidad Date Picker
    Dado que Maria esta en la APP Material Design
    Cuando actualiza la fecha <fecha> y hora <hora>
    Entonces deberia visualizar los datos actualizados <fecha> y <hora>
    Ejemplos:
      | fecha      | hora |
      | 2024-01-19 | 9:15 |