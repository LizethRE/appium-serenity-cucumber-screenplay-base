#language: es
# Author: LizethRE
Característica: Dialogs Demo
  YO COMO usuario de la APP Material Design
  QUIERO ingresar a la funcionalidad Dialogs Demo
  PARA poder interatuar con los componentes de Alerta

  @alertDialog
  Escenario: Activación de la alerta
    Dado que Maria esta en la APP Material Design
    Cuando activa el dialogo de alerta
    Entonces deberia visualizar el cuadro de dialogo
      | Titulo            | Description                                     |
      | Title AlertDialog | This is a short description for the popup alert |