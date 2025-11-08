🧩 **Start**

## 1- clone o repositório

no terminal digite:

git clone https://github.com/leonardorsolar/server-java-form-iff-start01.git

cd server-java-form-iff-start01

code .

## 2- Executando o app

acesse src/main/java/com/example/server_java_form_iff_start/ServerJavaFormIffStartApplication.java

Clique no ícone play na aba superior direita

ou

1. Usando o Maven Wrapper (Recomendado)

No terminal, execute:
./mvnw spring-boot:run

No Windows:
mvnw.cmd spring-boot:run

2. Usando Maven (se instalado no sistema)

mvn spring-boot:run

🧩 **Test**

## 1- Criação do arquivo de test

crie o arquivo tests/Conta.test.ts

### história de usuário:

História do Usuário 1.1: saldo da conta

Como usuário
Quero uma conta bancária
Para que eu possa visualizar o meu saldo inicial zero

### Teste de aceitação

Feature: Visualizar Saldo
Como cliente
Quero uma conta bancária
Para que eu possa visualizar o meu saldo

Cenário01: registro bem-sucedido
Dado que sou um usuário e tenho acesso a uma conta
Quando acesso o meu saldo
Então eu deveria visualizar o meu saldo inicial zerado

Cenário 02: falha ao visualizar saldo sem estar autenticado
Dado que não estou autenticado no sistema
Quando tento acessar o meu saldo
Então devo receber uma mensagem informando que é necessário realizar login
E não devo visualizar nenhuma informação de saldo

## 2- Adicione o codigo

test("Deve criar uma conta com saldo zero", () => {
// Given: dado que
// Aqui você deve criar qualquer configuração necessária para o teste.

        // When: Quando
        // Aqui você deve realizar a ação ou evento que está sendo testado.


        // Then: Então
        // Aqui você deve verificar se o resultado é o esperado.
        expect().toBe(0)
    })

test('Deve criar uma conta com saldo zero', () => {
//Give(dado que)
Dado que sou um usuário e tenho acesso a uma conta
//When (quando acontecer algo)
Quando acesso o meu saldo
//then (Então faça isso)
Então eu deveria visualizar o meu saldo incial zerado
});

## Começando:

## 1- Executando o teste

Para executar os testes em Java/Spring Boot, use um dos métodos abaixo:

1. Usando o Maven Wrapper (Recomendado)
   No terminal, execute todos os testes:
   ./mvnw test
   No Windows:
   mvnw.cmd test
2. Executar apenas um teste específico
   Para executar apenas UsuarioTeste.java:
   ./mvnw test -Dtest=UsuarioTeste
3. Usando Maven (se instalado no sistema)
   mvn test
   Para um teste específico:
   mvn test -Dtest=UsuarioTeste
4. Diretamente no Visual Studio Code
   Abra o arquivo UsuarioTeste.java
   Clique no ícone ▶️ Run Test ou Debug Test que aparece acima da classe ou método de teste
   Ou clique com o botão direito no arquivo e selecione Run Java
5. Usando o Testing Panel do VS Code
   Abra a aba Testing na barra lateral (ícone de béquer 🧪)
   Expanda a árvore de testes
   Clique no ícone ▶️ ao lado do teste que deseja executar
6. Usando o Command Palette
   Pressione Ctrl+Shift+P
   Digite: Java: Run Tests
   Selecione o teste desejado

## 2- implementando o código de teste.

Given: crie a instanciação
When: crie o método
Então: verifique o resultado do método

## 2- Usando o TDD

## Etapa 1: Escrevendo o primeiro teste (vermelho)

Comece escrevendo um teste com falha que especifique o comportamento desejado.

@Test
public void () {
//Give(dado que)
Dado que sou um usuário e tenho acesso a uma conta
//When (quando acontecer algo)
Quando acesso o meu saldo
//then (Então faça isso)
Então eu deveria visualizar o meu saldo incial zerado
}

Execute o test: ./mvnw test -Dtest=UsuarioTeste

ContaTeste.testCriarConta:22 Unresolved compilation problem:
variavel cannot be resolved to a variable
significa que no teste ContaTeste, na linha 22, há uma referência a uma variável que não foi declarada (ou está fora de escopo).

## Etapa 2: Fazendo o teste passar (verde)

Implemente o código mínimo necessário para fazer o teste passar.

package com.example.server_java_form_iff_start.Conta;

public class Conta {
private int saldo;

    public Conta() {
        this.saldo = 0; // Saldo inicial é zero
    }

}

Execute o test: ./mvnw test -Dtest=UsuarioTeste

## Etapa 3: Refatoração

O teste passou mas a implementação não está correta. Precisamos então precisamos continuar…

package com.example.server_java_form_iff_start.Conta;

public class Conta {
private int saldo;

    public Conta() {
        this.saldo = 0; // Saldo inicial é zero
    }

    public int getSaldo() {
        return saldo;
    }

}

Execute o test: ./mvnw test -Dtest=UsuarioTeste

-   POO: abastração, encapsulamento, coerência de responsabilidade (SRP do SOLID)
-   Protegendo os atributos e usando métodos de acesso

Execute o test: npm run test

Por que isso é melhor?
Encapsulamento: saldo agora é privado e só pode ser lido através de um método controlado (obterSaldo).
Abstração: usuários da classe não sabem como o saldo é armazenado, só que existe uma forma de obtê-lo.
Aberto para extensão, fechado para modificação (OCP): você pode futuramente aplicar regras como juros ou taxas sem mudar o uso da classe.

Etapa 4: Adicionando mais testes
TDD envolve escrever múltiplos testes para cobrir vários cenários.

### história de usuário:

História do Usuário 1.x: saldo da conta

Como usuário
Quero depositar 100 reais
Para que eu possa visualizar o meu saldo de 100 reais

### Teste de aceitação

Feature: Visualizar Saldo
Dado que sou um usuário e tenho acesso a uma conta
Quando credito 100 reais
Então eu deveria visualizar o meu saldo de 100 reais

test('Deve retornar zero da conta', () => {
//Give(dado que)
Dado que sou um usuário e tenho acesso a uma conta
//When (quando acontecer algo)
Quando credito 100 reais
//then (Então faça isso)
Então eu deveria visualizar o meu saldo de 100 reais
});
