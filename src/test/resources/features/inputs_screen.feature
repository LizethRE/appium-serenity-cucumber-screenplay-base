#language: es
# Author: LizethRE
Característica: Inputs Screen
  YO COMO usuario de la APP Material Design
  QUIERO ingresar a la funcionalidad Inputs Screen
  PARA poder diligenciar los formularios

  @inputsScreen @namesForm
  Escenario: Diligenciamiento correcto del formulario de nombres de Inputs Screen
    Dado que Maria esta en la APP Material Design
    Cuando diligencia el formulario de nombre
      | Names | Label  |
      | C     | Prueba |
    Entonces deberia visualizar la alerta con el mensaje Input is valid

  @inputsScreen @userForm
  Escenario: Diligenciamiento correcto del formulario de usuario de Inputs Screen
    Dado que Maria esta en la APP Material Design
    Cuando diligencia el formulario de usuario
      | Nombre | Celular    | Contrasenia |
      | Carlos | 3003141474 | Prueba.1    |
    Entonces deberia visualizar la alerta con el mensaje Form is valid

  @inputsScreen @namesForm @error
  Escenario: Diligenciamiento del formulario de nombres de Inputs Screen sin label
    Dado que Maria esta en la APP Material Design
    Cuando diligencia el formulario de nombre
      | Names | Label |
      | C     |       |
    Entonces deberia visualizar la alerta de error con el mensaje field is empty (Validator)