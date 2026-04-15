# 🚀 QA Automation Suite Corporativa

Este projeto é uma suíte de automação profissional robusta contemplando **Web, Mobile e API**, construída com a stack oficial corporativa do desafio Carrefour.

## 🛠️ Tecnologias Utilizadas
* **Java 25**
* **Selenium WebDriver & Appium**
* **RestAssured**
* **Cucumber BDD**
* **JUnit 5**
* **Allure Report**
* **Docker & Kubernetes**
* **GitHub Actions CI/CD**

## 📂 Estrutura Modular
O projeto adota o padrão **Maven Multi-Module** visando escalabilidade:
* **`qa-core`**: Factory de Drivers, Utils (EvidenceManager que coleta screenshots com borda vermelha e pastas datadas) e Páginas Base.
* **`qa-api`**: Testes de back-end utilizando a API pública ServeRest (baseado no desafio-api-carrefour).
* **`qa-web`**: Testes front-end integrando SauceDemo.
* **`qa-mobile`**: Testes Appium para aplicações móveis nativas (baseado no desafio-mobile-carrefour).

## ▶️ Como executar
1. Abra o projeto na sua IDE.
2. Certifique-se de baixar dependências com `mvn clean install -DskipTests`.
3. Rode `mvn test` para executar tudo (ou rode os profiles específicos dos pom.xml dentro das pastas target).
4. Rode `mvn allure:serve` para visualizar o Dashboard interativo dos relatórios.
