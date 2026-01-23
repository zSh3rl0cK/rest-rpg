# Java REST RPG Game

## Visão Geral

Este projeto tem como objetivo o desenvolvimento de um mini jogo de RPG implementado **inteiramente em Java**, com **integração a um banco de dados MySQL**. A aplicação será estruturada como uma **API REST**, pensada para ser consumida por uma aplicação externa, a qual seria onde o jogo rodaria de fato.

O projeto também serve como base prática para o estudo e aplicação do **Spring Framework**, especialmente Spring Boot e conceitos de arquitetura backend.

---

## Arquitetura e Abordagem

Este projeto não executa o jogo diretamente no backend. Em vez disso, ele funciona como um motor das regras e um tipo de gerenciador dos de estados, exposto através da API REST.

### A aplicação backend é responsável por:
- Validar ações do jogador (ataques, uso de feitiços, movimentação, etc.)
- Aplicar as regras do RPG
- Atualizar e persistir o estado do jogo (personagens, combates, expedições)
- Retornar o novo estado para o cliente

### Assim, evitando:
- API rodando em tempo real
- loops infinitos ou lógica contínua no servidor

Essa abordagem permite que o projeto seja escalável, testável e alinhado com boas práticas de APIs REST, ao mesmo tempo em que mantém a complexidade e profundidade de um jogo de RPG. 

---

## Status do Projeto

* Projeto em estágio inicial
* Estrutura base de classes em desenvolvimento
* História principal ainda em expansão
* Integração com Spring e MySQL em estágio inicial

## História Base do Jogo

---

### Contexto Geral

O jogo se passa em um mundo de **fantasia medieval pós-apocalíptico**, devastado por uma **praga demoníaca**. Após o colapso da antiga civilização, a humanidade sobrevive agora em poucas cidades que conseguiram se reerguer em um novo continente — uma região pouco explorada e que não foi alcançada pela praga.

Grupos humanos ainda sobrevivem no continente central, porém de forma descentralizada, lutando em meio às ruínas da antiga civilização.

O chamado “fim dos tempos” ocorreu há **19 anos**. O ano em que o jogo se passa marca o **20º aniversário** desse evento. As cidades do novo continente são fruto das **seis maiores guildas da antiga civilização**, que, em um plano de última hora, organizaram um grande êxodo.

Após a chegada ao novo continente, foi firmado um acordo de **divisão igualitária das terras**, dando origem às **seis principais cidades**, cada uma associada a uma guilda.

---

### O Protagonista

O jogador controla um jovem nascido durante o êxodo. Sua mãe estava grávida durante a fuga e deu à luz no exato dia em que alcançou o novo continente.

Seu pai — vivo ou morto — foi o responsável por guiar sua mãe durante a travessia. Ele fazia parte de uma das guildas mais fracas e conseguiu garantir apenas **uma vaga** no navio. Para salvar a esposa e o filho, ele ficou para trás.

A mãe do protagonista nunca soube disso. A história oficial, contada por um antigo companheiro do pai, afirma que ele morreu contaminado pela praga demoníaca durante um ataque de criaturas no momento da partida das caravanas.

Na verdade, o pai permaneceu no continente antigo junto de outros soldados, sacrificando-se para garantir a fuga das últimas embarcações. Seu destino real é desconhecido.

Antes da separação, o pai deixou um presente destinado ao filho quando completasse **20 anos**: um conjunto de armas correspondente à classe escolhida pelo jogador, acompanhado de uma carta.

Na carta, ele relata seus desejos de ver o filho crescer e revela a verdade sobre sua escolha de ficar para trás. Vinte anos se passaram desde então, e nada mais se sabe sobre seu paradeiro.

---

### As Expedições

Todos os anos, as seis guildas selecionam seus melhores guerreiros para realizar uma **expedição ao antigo continente**, em busca de recursos e tecnologias da antiga civilização, que são extremamente escassos no novo mundo.

Poucas expedições retornam com sucesso.

O protagonista cresceu treinando na academia juvenil da guilda mais fraca. A expedição ocorre sempre no dia da comemoração do êxodo — **23 de outubro**, o mesmo dia de seu aniversário.

Inicialmente, o protagonista nutria aversão a essa data, pois muitos de seus mentores e figuras paternas nunca retornaram dessas missões. Contudo, após descobrir a carta de seu pai, ele passa a ver a expedição como uma oportunidade de encontrar respostas.

Movido pela esperança de que seu pai ainda esteja vivo, o jogador decide se juntar à próxima expedição.

Para isso, ele se une a **cinco amigos**, cada um pertencente a uma classe diferente e portador de um elemento distinto, definidos de forma aleatória após a criação do personagem principal.

---
