#language: es
# Author: LizethRE
Característica: PageView Carousel
  YO COMO usuario de la APP Material Design
  QUIERO ingresar a la funcionalidad PageView Carousel
  PARA poder interatuar con los componentes de Carousel Slider

  @carousel
  Esquema del escenario: Visualización de los productos de la pagina Carousel Slider
    Dado que Maria esta en la APP Material Design
    Cuando busca el producto <producto>
    Entonces deberia visualizar el producto <producto>
    Ejemplos:
      | producto |
      | 5        |