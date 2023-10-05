Feature: Login
  Scenario Outline: Login válido
    Given que eu estou na tela inicial
    When insiro credenciais validas "<username>" e "<password>"
    And clico em login
    Then sou autenticado com sucesso
    Examples:
      | username     | password     |
      | standard_user| secret_sauce |

  Scenario Outline: Login inválido
    Given que eu estou na tela inicial
    When insiro credenciais inválidas "<username>" e "<password>"
    And clico em login
    Then não sou autenticado
    Examples:
      | username     | password    |
      | standarduser | secretsauce |

  Scenario Outline: Usuário bloqueado
    Given que eu estou na tela inicial
    When insiro as credenciais "<username>" e "<password>"
    And clico em login
    Then recebo uma notificação de usuário bloqueado
    Examples:
      | username       | password     |
      |locked_out_user | secret_sauce |

