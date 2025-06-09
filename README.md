# 💱 Conversor de Moedas - Java

Projeto de conversão de moedas desenvolvido em Java puro, utilizando a [ExchangeRate API](https://app.exchangerate-api.com) para buscar as taxas de câmbio em tempo real.

---

## 🚀 Funcionalidades

* Conversão entre moedas como Dólar, Real, Peso Argentino e Peso Colombiano.
* Histórico de conversões salvo em um arquivo `.txt`.
* Interface via terminal.
* Consumo de API externa com autenticação via chave (API Key).
* Utilização do GSON para serialização da resposta JSON.
* Estrutura de projeto organizada em camadas: `model`, `api`, `service`.

---

## 📁 Estrutura de Pastas

```
src/
├── br/
│   └── com/
│       └── alura/
│           └── conversor/
│               ├── api/
│               ├── model/
│               ├── service/
│               └── Main.java
├── .env
├── config/
├── historico.txt
```

---

## 💠 Tecnologias

* Java 17
* GSON
* ExchangeRate API
* IntelliJ IDEA (ou outro editor Java)
* `.env` para variáveis sensíveis

---

## 🧑‍💻 Como rodar o projeto localmente

### 1. Clone o repositório

```bash
git clone https://github.com/ErickTCosta/conversor-moeda.git
cd conversor-moeda
```

---

### 2. Crie o arquivo `.env`

Na raiz do projeto (mesmo nível da pasta `src`), crie um arquivo chamado `.env` com o seguinte conteúdo:

```env
EXCHANGE_RATE_API_KEY=SUA-CHAVE-API
```

🔐 Substitua `SUA-CHAVE-API` pela chave gerada gratuitamente em:
👉 [https://app.exchangerate-api.com](https://app.exchangerate-api.com)

---

### 3. Execute a aplicação

Abra o projeto no IntelliJ IDEA:

1. Vá em `Main.java`
2. Clique com o botão direito no método `main`
3. Selecione `Run 'Main.main()'`

---

## 📄 Histórico de Conversões

As conversões realizadas são armazenadas automaticamente no arquivo:

```
historico.txt
```

Cada linha segue o formato:

```
100.00 USD => 52350.00 COP
```

---

## 📆 Dependências externas

Este projeto utiliza:

* `gson-2.10.1.jar`
* `dotenv-java` (caso você deseje ler variáveis do `.env` automaticamente)

Você pode adicionar os `.jar` manualmente no IntelliJ, ou utilizar um sistema de build como Maven/Gradle futuramente.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir *Issues* ou enviar *Pull Requests*.

---

## 📢 Agradecimentos

Projeto desenvolvido como parte do **Challenge ONE - Back-End Java** da plataforma **Alura**.

---

## 🪪 Licença

MIT © Erick  Costa
