Feature: Login Mobile Nativo
  Como usuario de app
  Quero fazer login no app webdriverio
  Para acessar a dash

  @mobile @login
  Scenario: Login mobile com sucesso
    Given que abro o app demo do webdriverio
    When navego ate a tab de login
    And preencho usuario "user@email.com" e senha "password" no mobile
    Then logo e valido a mensagem de sucesso
