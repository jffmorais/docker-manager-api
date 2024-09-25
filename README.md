# Docker Manager API

Esta API foi desenvolvida para gerenciar um servidor de containers Docker, oferecendo funcionalidades similares ao Docker Desktop. Com ela, você pode:

- Iniciar containers
- Parar containers
- Deletar containers
- Criar novos containers ao enviar o nome da imagem Docker

## Tecnologias Utilizadas

- **Java**: Linguagem principal da API.
- **docker-java**: Biblioteca para integração com a API do Docker. Para mais informações sobre como utilizá-la, veja a [documentação oficial](https://github.com/docker-java/docker-java/blob/main/docs/getting_started.md).

## Pré-requisitos

Antes de iniciar a aplicação, é importante que o **Docker Daemon** esteja exposto. Se você já utiliza o Docker Desktop, siga os passos abaixo para habilitar essa configuração.

### Expor Docker Daemon

1. Acesse as configurações do Docker Desktop.
2. Vá até a seção "General".
3. Ative a opção "Expose daemon on tcp://localhost:2375 without TLS".

Exemplo de como habilitar:

![Expor Docker Daemon](https://miro.medium.com/v2/resize:fit:720/format:webp/1*gsi05ajDfJrZBGOCn0ht0Q.png)

## Como Rodar a Aplicação

1. Clone o repositório:

    ```bash
    git clone https://github.com/jffmorais/docker-manager-api.git
    ```

2. Navegue até o diretório da aplicação:

    ```bash
    cd docker-manager-api
    ```

3. Compile e rode a aplicação:

    ```bash
    ./mvnw spring-boot:run
    ```

## Endpoints Disponíveis

- **GET /containers**: Retorna a lista de containers em execução.
- **POST /containers/start**: Inicia um container.
- **POST /containers/stop**: Para um container.
- **DELETE /containers/{id}**: Deleta um container pelo ID.
- **POST /containers/create**: Cria um novo container com base no nome da imagem enviada.

## Contribuição

Sinta-se à vontade para contribuir com melhorias e novas funcionalidades! Abra uma _issue_ ou envie um _pull request_ com suas sugestões.
