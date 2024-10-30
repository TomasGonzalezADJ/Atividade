# Projeto de Simulação de Cartão de Crédito

## Descrição do Projeto

Este projeto é uma simulação da lógica de um sistema de cartão de crédito, desenvolvido como atividade prática para a faculdade. O programa permite que o usuário registre compras, calcule o valor da fatura e aplique juros caso o pagamento seja feito após a data limite.

## Funcionalidades

- Registrar o valor de múltiplas compras.
- Solicitar a data de pagamento da fatura.
- Calcular o valor total da fatura com ou sem juros:
    - **Sem juros**: Pagamentos realizados até o dia 25 do mês.
    - **Com juros**: Pagamentos realizados após o dia 25, aplicando:
        - 3% de juros sobre o valor total.
        - 1% adicional por dia de atraso após o dia 25.

## Tecnologias Utilizadas

- Linguagem: **Java 17**
- Ambiente de Desenvolvimento: **IntelliJ IDEA**
- Controle de Versão: **Git**

## Pré-requisitos

Antes de executar o programa, certifique-se de que você possui as seguintes ferramentas instaladas em seu ambiente:

- **Java 17** ou superior.
- **IntelliJ IDEA** (ou outra IDE compatível com Java).
- **Git** para controle de versão.

## Como Executar o Projeto

1. Clone o repositório:

    ```bash
    git clone <URL do repositório>
    ```

2. Abra o projeto na sua IDE (recomendado: IntelliJ IDEA).

3. Execute o programa principal localizado em `src/main/java/br/com/tomas/CartaoDeCredito.java`.

4. Siga as instruções exibidas no console para registrar as compras e simular a lógica de pagamento e juros.

## Exemplo de Uso

```plaintext
Digite o valor da compra: 1000
É a última compra? (S/N): n
Digite o valor da compra: 500
É a última compra? (S/N): s
Digite o dia do pagamento da fatura (1-31): 27
Valor total da fatura: R$ 1500,00
Juros aplicados: R$ 45,00
Valor a pagar: R$ 1545,00
