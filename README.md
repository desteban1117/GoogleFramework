# GoogleFramework

Este es un pequeño framework the Automatización en el que se automatizan los siguientes escenarios:
```
Scenario: User can search with "Google Search"
    Given I am on Google homepage
    When I type "The name of the wind" into the search field
    And I click the Google Search button
    Then I am on Google result page
    And The first result is "El nombre del viento - Wikipedia, la enciclopedia libre"
    When I click on the first result link
    Then I go to the Wikipedia "El nombre del viento" page

  Scenario: User can search by using the suggestions
    Given I am on Google homepage
    When I type "The name of the wind" into the search field
    And The suggestion list is displayed
    And I click on the first suggestion in the list
    Then I am on Google result page
    And The first result is "El nombre del viento - Wikipedia, la enciclopedia libre"
    When I click on the first result link
    Then I go to the Wikipedia "El nombre del viento" page
```
## Prerequisitos
Para correr este framework de forma local se debe tener instalado los siguiente programas:
- Java >= 8
- Maven

## Corriendo el framework
Una ves instalados Java y Maven con todas sus variables de entorno, pasamos a clonar el repositorio con el comando:

`git clone https://github.com/desteban1117/GoogleFramework.git`

entramos a la carpeta `GoogleFramework` y utilizamos el siguiente comando para correr los dos scenarios descritos previamente
`mvn clean test`

Por default el framework corre usando Google Chrome. Actualmente el framework solo soporta dos browsers, firefox y crhome.
Si se desea correr en firefox simplemente usamos el siguiente comando

`mvn clean test -DBROWSER=firefox`


## Revisando Reporte
Para revisar el reporte generado por cucumber simplemente se debe acceder al siguiente link que aparecerá en consola una ves hayamos corrido el framework:
![WhatsApp Image 2022-01-16 at 9 12 33 AM](https://user-images.githubusercontent.com/25933257/149663695-505783c1-2f46-40a6-b84f-ab6c7f37424a.jpeg)

