#  Gerenciador de Tarefas

Sistema web de gerenciamento de tarefas desenvolvido utilizando Spring Boot, MySQL e JavaScript, com autenticação JWT e integração completa entre frontend, backend e banco de dados.

---

#  Objetivo do Projeto

O objetivo do TaskEasy é auxiliar usuários na organização de tarefas do dia a dia, permitindo cadastro, visualização e gerenciamento de atividades de forma simples e eficiente.

O projeto foi desenvolvido como atividade acadêmica da disciplina de Engenharia de Software, aplicando conceitos de desenvolvimento full stack, arquitetura em camadas e integração de sistemas.

---

#  Tecnologias Utilizadas

##  Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- Maven

##  Frontend
- HTML5
- CSS3
- JavaScript

##  Banco de Dados
- MySQL

##  DevOps
- Docker
- Docker Compose

---
# Personas:

Maria Silva
Idade: 17 anos
Ocupação: Estudante
Problema: Esquece prazos de trabalhos e provas.
Objetivo: Organizar seus estudos.

João Santos
Idade: 35 anos
Ocupação: Trabalhador CLT
Problema: Não consegue organizar tarefas do trabalho e da vida pessoal.
Objetivo: Melhorar produtividade no dia a dia.

Carlos Matos:
Idade: 40 anos
Ocupação: Professor
Problema: Tendo mais de uma turma que da aula, acaba se perdendo na organização de tarefa, apresentações, correções de provas e prazos.
Objetivo: Organização de tarefas do trabalho.


Jessica Pereira
Idade: 28 anos
Ocupação: Dona de Casa
Problema: Como as tarefas de casa nunca terminam, ela tem dificuldade de organizar seu tempo para organizar a casa, passar tempo com os filhos e marido e tempo de laser.
Objetivo: Melhorar distribuição de tarefas no dia a dia. 

---

# Requisitos Funcionais (RF)
RF01: O sistema deve permitir cadastro de usuários
RF02: O sistema deve permitir login de usuários
RF03: O sistema deve permitir cadastrar tarefas
RF04: O sistema deve permitir editar tarefas
RF05: O sistema deve permitir excluir tarefas
RF06: O sistema deve permitir marcar tarefas como concluídas

---
# Requisitos Não Funcionais(RNF)
RNF01: O sistema deve ter tempo de resposta rápido
RNF02: O sistema deve garantir segurança dos dados
RNF03: O sistema deve ser fácil de usar

---

#  Funcionalidades

 Login com autenticação JWT;  
 Criar tarefas;  
 Listar tarefas;  
 Excluir tarefas;  
 Integração completa com banco de dados;  
 API REST funcional;  

---
# Diagrama de Arquitetura (Geral)

Estrutura do sistema:

Usuario
   ↓
Frontend (Web/App)
   ↓
Backend - Spring Boot API
   ↓
MySQL Database

## Explicação:

Usuário interage com interface
Frontend envia requisições
Backend processa regras
Banco armazena dados

## Relacionamento:

Usuário 1:N Tarefa

## Diagrama de Sequência (Criar Tarefa)

Usuário → Frontend → Controller → Service → Repository → Banco

## Diagrama de Caso de Uso

Ator: Usuário
Casos:
Fazer cadastro
Fazer login
Criar tarefa
Editar tarefa
Excluir tarefa
Concluir tarefa

---

# Principais fluxos implementados:

## Login:

Usuário envia email e senha
Backend valida e retorna token JWT

## Listar tarefas:

Frontend solicita dados
Backend consulta o banco
Retorna lista de tarefas

## Criar tarefa:

Usuário envia nova tarefa
Backend salva no banco

## Excluir tarefa:

Usuário remove tarefa
Backend deleta do banco

---

#  Vídeo de Apresentação

https://youtu.be/0zDH2xc0IIs

---

#  Desenvolvedora

Helen Luiza Alves Pereira

Curso: Análise e Desenvolvimento de Sistemas
