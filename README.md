# Automação de Teste Web com Selenium WebDriver e Cucumber

Este projeto é um exemplo de automação de testes web usando Selenium WebDriver e Cucumber.

Utilizei o site https://www.saucedemo.com para realizar um teste de login válido, inválido e usuário bloqueado.

## Pré-requisitos
- **ChromeDriver**: Faça o download do ChromeDriver de acordo com a versão do seu chrome
https://chromedriver.chromium.org/downloads

- **Dependências Maven**:
    - Cucumber
    - Selenium
    - JUnit

## Estrutura do Projeto
- **.feature**: nele contem os BDDs
- **Steps**: os passos definidos nos arquivos `.feature` são convertidos em métodos Java para que a automação possa executar as ações
- **Page**: usada para o mapeamento de objetos da página web
- **Logic**: são definidos métodos para realizar ações específicas e verificar as validações de teste.
