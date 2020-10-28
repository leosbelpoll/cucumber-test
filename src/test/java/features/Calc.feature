Feature: Calculadora
  Probar que el usuario pueda realizar todas las operaciones disponibles en la calculadora

  Scenario Outline: Probar la operacion suma
    When Cuando el usuario suma <num1> y <num2>
    Then el resultado es <numR>
    Examples:
      | num1 | num2 | numR |
      | 5    | 5    | 10   |
      | 3    | 4    | 7    |
      | 6    | 2    | 8    |

  Scenario Outline: Probar la operacion resta
    When Cuando el usuario resta <num1> y <num2>
    Then el resultado es <numR>
    Examples:
      | num1 | num2 | numR |
      | 5    | 4    | 1    |
      | 8    | 6    | 2    |
      | 9    | 3    | 6    |

  Scenario Outline: Probar la operacion multiplicacion
    When Cuando el usuario multiplica <num1> y <num2>
    Then el resultado es <numR>
    Examples:
      | num1 | num2 | numR |
      | 5    | 4    | 20   |
      | 8    | 5    | 40   |
      | 5    | 3    | 15   |

  Scenario Outline: Probar la operacion division
    When Cuando el usuario divide <num1> y <num2>
    Then el resultado es <numR>
    Examples:
      | num1 | num2 | numR |
      | 10   | 2    | 5    |
      | 20   | 5    | 4    |
      | 30   | 3    | 10   |

  Scenario: Probar la operacion division por cero
    When Cuando el usuario divide por cero la funcion lanza una exception