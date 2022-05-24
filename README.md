# Algalog API

Projeto desenvolvido no evento "Mergulhador Spring REST" proporcionado pela AlgaWorks. Nesse projeto aprendi conceitos essenciais e boas práticas para o desenvolvimento de API's. Ainda, aprofundei meu conhecimento sobre Spring e Spring Framework, Jakarta Persistence e Flyway.

## Tecnologias

- [Spring/Spring Framework](https://spring.io)
- [Spring Tools 4](https://spring.io/tools)
- [Lombok](https://projectlombok.org)
- [Flyway](https://flywaydb.org)

## Como executar o projeto

Para executar esse projeto siga os seguintes passos:

- Tenha uma IDE instalada, de preferência Spring Tools 4 ou versão similar.
- Baixe o Lombok e prepare a IDE para suportar annotations de Getter, Setter e etc.
- Crie um uma database com MySql de nome de "algalog". Se for utilizar outro SGBD lembre-se de realizar as alterações referentes a driver, usuário e senha do SGBD escolhido no arquivo src\main\resources\application.properties.
- Se não ocorreram problemas na configuração do projeto ele já poderá ser executado. o Flyway realizará a criação das tabelas no banco e será possível interagir com a API através de Insomnia, Postman e até do navegador.