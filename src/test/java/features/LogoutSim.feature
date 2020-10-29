@login @e2e
Feature: Logout

  Background:
    Given El usuario esta autenticado en el sistema SIM

  Scenario: Salir del sistema
    When Selecciona el boton Salir
    Then Verificar que el sistema muestra la pantalla de login

