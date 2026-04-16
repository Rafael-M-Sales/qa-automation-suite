Feature: Compras SauceDemo
  Como usuario logado
  Quero adicionar produtos ao carrinho
  Para realizar uma compra

  Background:
    Given que eu acesso a pagina de login web "https://www.saucedemo.com/"
    When eu preencho o usuario "standard_user" e a senha "secret_sauce"
    And clico no botao de login

  @web @compras
  Scenario: Adicionar mochila ao carrinho com sucesso
    When eu clico no botao de adicionar ao carrinho do produto Sauce Labs Backpack
    Then devo ver o icone do carrinho com a quantidade "1"

  @web @compras
  Scenario: Acessar a pagina do carrinho
    When eu clico no botao de adicionar ao carrinho do produto Sauce Labs Backpack
    And eu clico no icone do carrinho
    Then devo ser redirecionado para a pagina do carrinho
    And o produto Sauce Labs Backpack deve estar listado
