# API-EVENT-PLANNER

## Descripción

Contiene toda la funcionalidad backend para el proyecto EventPlanner (i.e: Crear eventos, devolver detalle de eventos,
eliminar evento, editar evento, etc)

## Ejecutar el API

#### 0. Configurar entorno (ver [preparativos](#preparación-del-proyecto))

#### 1. Levantar la base MongoDB:

- Asegurarse de que Docker está corriendo
    - En la sección de iconos ocultos al lado del reloj de windows aparece un
      ícono de una ballena.
    - Sino, buscarlo en el inicio de windows y ejecutarlo)
- Abrir una terminal en IntelliJIdea
- Ejecutar lo siguiente:
    - `cd docker`
    - `docker-compose up`

#### 2. Lanzar el API

- Abrir `EventplannerApplication`
- Click secundario en el código
- Seleccionar _Run EventplannerApplication_

## Preparación del proyecto

#### Dependencias:

- Tener instalado un IDE ([Eclipse](https://www.eclipse.org/downloads/), [IntellijIdea](https://www.jetbrains.com/idea/download/))
- Tener instalada una JDK de java 17 o mayor (Para descargar pueden buscar [aca](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html))
- Tener instalado docker ([tutorial para instalarlo en WIN_10](https://docs.docker.com/desktop/install/windows-install/))

#### Configuraciones

- Configurar la JDK de java (acá un pequeño [tutorial](https://programacionfacil.org/blog/instalacion-de-ide-y-java-para-empezar-a-programar/))
- (Solo para _IntelliJIdea_) Establecer la JDK que instalaron para el proyecto
    - Hacer click secundario en el nombre del proyecto dentro de la ventana `Project`
    - Seleccionar `Open Module Settings`
    - Dentro del apartado `Project Settings` ir a la sección `Project`
    - Seleccionar la JDK 17 que instalaron o agregarla mediante _Add SDK_
- (Solo para _IntelliJIdea_) Establecer a intelliJIdea como runner
    - Ir al menú `File`
    - Seleccionar `Settings`
    - Ir a la sección `Build, Execution, Deployment` > `Build tools` > `Gradle`
    - Asegurarse de que el combo `Build and Run using` contenga `IntelliJIdea`
    - Asegurarse de que el combo `Run tests using` contenga `IntelliJIdea`
    - Asegurarse de que el combo `Gradle JVM` apunte a la JDK que instalaron