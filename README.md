# Proyecto Automatización Móvil
Proyecto base para la automatización de pruebas de aplicaciones móviles utilizando Appium, Serenity BDD, Cucumber y el patrón Screenplay.

## Contenido
* [Prerrequisitos](#prerrequisitos)
* [Instalación](#instalación)
* [Estructura del Proyecto](#estructura-del-proyecto)
* [Configuración](#configuración)
* [Ejecución de Pruebas](#ejecución-de-pruebas)
* [Contribución](#contribución)
* [Licencia](#licencia)

## Prerrequisitos
* Java JDK 17 o superior
* IDE (Intellij o Eclipse)
* Android Debug Bridge (ADB)
* Appium Server 2.0 o superior
* Dispositivo móvil o emulador

## Instalación
Clona el repositorio:
```shell
   git clone https://github.com/LizethRE/appium-serenity-screenplay-base (EDITANDO)
   cd appium-serenity-screenplay-base (EDITANDO)
```

## Estructura del Proyecto
```Gherkin
src
├── main
│   └── java (com.base.certification)     # Estructura del Patrón Screenplay
│       └── interactions                  # Acciones de bajo nivel
│       └── model                         # Objectos de negocio
│       └── questions                     # Aserciones o verificaciones de las pruebas
│       └── tasks                         # Acciones de alto nivel (grupo de interaciones)
│       └── userinterfaces                # Mapeo de elementos de las paginas
└── test
    ├── java (com.base.certification)     
    │   └── runners                      # Ejecutores de las prueba
    │   └── stepdefinitions              # Definiciones de los pasos a nivel Given, When, Then, ...
    └── resources                        
        └── data                         # Data requerida para las pruebas
        └── features                     # Archivos Feature en lenguaje Gherkin
```

## Configuración
Configura en el archivo `serenity.conf` ubicado en la ruta `src/test/resources/` las capabilities correspondientes al dispositivo o emulador a utilizar y la aplicación a probar.

```json lines
appium {
    ...
    platformName = "Android"
    platformVersion = "13.0"
    deviceName = "Redmi 10C"
    udid = "b6f2c6d"
    appActivity = ".MainActivity"
    appPackage = "com.example.material3_show_case"
    ...
}
```

## Ejecución de las pruebas
### Ejecutar todo el proyecto
```shell
./gradlew clean test
```

### Ejecutar por runner
```shell
./gradle clean test --tests "com.base.certification.runners.nombreRunner"
```

## Reporteria
El reporte se genera en la ruta `target/site/serenity/`, archivo principal `index.html`

## Licencia
Open source project.


