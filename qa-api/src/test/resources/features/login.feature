Feature: Login API
  Como uma aplicação cliente
  Quero realizar a autenticação na API ServeRest
  Para obter acesso aos endpoints protegidos

  @api @login
  Scenario: Login com sucesso
    Given que eu configuro a rota de login
    When eu envio a requisicao de login com email "fulano@qa.com" e senha "teste"
    Then o status code deve ser 200
    And a resposta deve conter a mensagem "Login realizado com sucesso"
