# 📦 Gerador de QR Code

Este projeto é uma aplicação Java que gera códigos QR personalizados a partir de entradas fornecidas pelo usuário e os retorna na response da requisição

## Funcionalidades

- Geração de QR Code a partir de texto, URLs ou qualquer entrada em string
- Estrutura modular e escalável

## Tecnologias Utilizadas

- Java 21+
- Maven
- [ZXing](https://github.com/zxing/zxing) – Biblioteca para geração de QR Code
- Docker (opcional)

## Estrutura do Projeto

```
qr-code-generator-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── qr_code_gen/
│   │   │       ├── controllers/
│   │   │       ├── dto/
│   │   │       │   └── qrcode/
│   │   │       └── services/
│   │   └── resources/
│   └── test/
├── .env
├── Dockerfile
├── pom.xml
└── README.md


## Executando o Projeto

### Usando Maven

```bash
mvn clean package
java -jar target/qr-code-generator-service.jar
```

### Usando Docker

```bash
docker build -t qr-code-generator-service:1.0 .
docker run qr-code-generator-service
```

## Exemplo de Funcionamento

1. Usuário envia uma string contendo a URL.
2. A aplicação gera um QR Code correspondente em formato PNG.
3. A imagem é retonada na resposta do endpoint **POST** `qrcode`

## QrCode gerado pelo projeto

![Captura de tela de 2025-06-30 20-26-11](https://github.com/user-attachments/assets/d195e134-9f05-42b9-95e5-8d911f7c1965)

## Licença

Distribuído sob a licença MIT. Veja o arquivo `LICENSE` para mais informações.
