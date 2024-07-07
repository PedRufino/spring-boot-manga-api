# Spring Boot Manga Api
API em Spring Boot para gerenciamento de mangás, integrando dados de um arquivo JSON armazenado no AWS S3 e permitindo pesquisa por título.

### Tecnologias Utilizadas
- Java 17
- SpringBoot 3.3.1
- Spring Boot DevTools
- OpenFeign
- Lombok
- Maven
- AWS S3

### Funcionamento da API:

Todos os Mangás disponível:

    http://localhost:8080/api/mangas

Pesquisar mangás por título:

    http://localhost:8080/api/mangas/search?title=Naruto

### Bibliografia
[Criando API do Zero com Java Spring](https://www.youtube.com/live/MuF_jkfdqUo?si=4X2UbxeSr0vINiCI&t=290)
