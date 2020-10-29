@login @e2e
Feature: Login

  Scenario: Acceso correcto al sistema
    When Verificar que el sistema muestra la pantalla de login

  Scenario: Login valido
    When Verificar que el sistema muestra la pantalla de login
    And Ingresar usuario "admin"
    And Ingresar contrasenna "admin123"
    And Hacer clic en el boton Confirmar
    Then El usuario ingresa de forma correcta al sistema

  Scenario: Login invalido
    When Verificar que el sistema muestra la pantalla de login
    And Ingresar usuario "lalala"
    And Ingresar contrasenna "lalala"
    And Hacer clic en el boton Confirmar
    Then El sistema muestra mensaje de error


