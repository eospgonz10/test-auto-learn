Feature: Vista métricas de promociones
  Como usuario registrado
  Quiero ver las métricas de ventas de mis promociones activas
  Para identificar su utilidad de ventas

  Background:
    Given que el usuario está en la página principal de Fluffy Deals Hub
    When accede al formulario de autenticación
    And ingresa sus credenciales "alice@example.com" y "password123"
    And confirma el inicio de sesión

  Scenario: Ver métricas de una promoción activa
    When accede a la vista de métricas de la promoción activa
    Then debería ver las métricas de dicha promoción en ventas
