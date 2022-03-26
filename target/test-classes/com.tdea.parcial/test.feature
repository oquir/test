Feature: hora del dia

  Scenario: es de Night cuando la hora es mayor igual a 0 y menor a 6
    Given nos dan 4
    When verificamos si es Night
    Then obtenemos que es de Night

  Scenario: es de Morning cuando la hora es mayor igual a 6 y menor a 12
    Given nos dan 7
    When verificamos si es Morning
    Then obtenemos que es de Morning

  Scenario: es de Afternoon cuando la hora es mayor igual a 12 y menor a 18
    Given nos dan 16
    When verificamos si es Afternoon
    Then obtenemos que es de Afternoon

  Scenario: es de Evening cuando la hora es mayor igual a 18 y menor a 24
    Given nos dan 20
    When verificamos si es Evening
    Then obtenemos que es de Evening

  Scenario: es de Invalid hour cuando la hora es mayor a 24
    Given nos dan 25
    When verificamos si es Invalid hour
    Then obtenemos que es de Invalid hour