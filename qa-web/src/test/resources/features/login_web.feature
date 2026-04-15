Feature: Login Web Saucedemo
  Como usuario do ecommerce
  Quero fazer login no sistema
  Para acessar a vitrine de produtos

  @web @login
  Scenario: Realizar login com sucesso na web
    Given que eu acesso a pagina de login web "https://www.saucedemo.com/"
    When eu preencho o usuario "standard_user" e a senha "secret_sauce"
    And clico no botao de login
    Then devo ser redirecionado para a pagina de inventario com o titulo "Products"
