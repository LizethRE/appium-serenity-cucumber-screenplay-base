#language: es
# Author: LizethRE
Característica: Version
  YO COMO usuario de la APP Material Design
  QUIERO cambiar la versión de la APP
  PARA poder utilizar los componentes de la v2

  @version @v3
  Esquema del escenario: Cambio de la version 3 a la version 2
    Dado que Maria esta en la APP Material Design
    Cuando cambia a la version <version>
    Entonces deberia visualizar la version <version>
    Ejemplos:
      | version |
      | 2       |

  @version @v2
  Esquema del escenario: Cambio de la version 2 a la version 3
    Dado que Maria esta en la APP Material Design
    Cuando cambia a la version <version>
    Entonces deberia visualizar la version <version>
    Ejemplos:
      | version |
      | 3       |