# Projeto Produtos - Java (POO)

Este projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais
de Programação Orientada a Objetos utilizando a linguagem Java.

## 📚 Conceitos aplicados

- Herança
- Polimorfismo
- Sobrescrita de métodos (@Override)
- Encapsulamento
- Listas com Generics
- Validação de entrada com Scanner
- Manipulação de datas com LocalDate e DateTimeFormatter

## 🧩 Descrição do projeto

O sistema permite o cadastro de diferentes tipos de produtos:
- Produto comum
- Produto importado (com taxa de importação)
- Produto usado (com data de fabricação)

Cada tipo de produto possui sua própria forma de exibir a etiqueta de preço,
utilizando polimorfismo para sobrescrever o método `etiquetaPreco()`.

## 🛠️ Tecnologias utilizadas

- Java
- API java.time (LocalDate)
- Collections Framework (List, ArrayList)

## ▶️ Execução

O programa é executado via console e solicita ao usuário:
1. A quantidade de produtos
2. O tipo de cada produto
3. Os dados específicos conforme o tipo selecionado

Ao final, são exibidas as etiquetas de preço de todos os produtos cadastrados.

## 🎯 Objetivo

Projeto acadêmico / estudo pessoal, focado no aprendizado e fixação
dos conceitos de POO em Java.
