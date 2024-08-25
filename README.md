# README - HERANÇA

Este repositório contém exemplos de herança em Java, demonstrando a criação e uso de classes e subclasses com atributos, métodos e funcionalidades herdadas. Os exercícios seguem uma sequência de evolução dos conceitos de programação orientada a objetos.

## Exercício 01

**Descrição**  
Criação da classe `Pessoa` com atributos encapsulados e diversos construtores.

**Atributos**
- `String nome`
- `String endereço`
- `String telefone`

**Métodos**
- Construtores:
  - Padrão
  - Com parâmetros para todos os atributos
  - Com parâmetros para nome e telefone
- Getters e Setters para cada atributo
- Método `toString()` para exibir os detalhes da pessoa

## Exercício 02

**Descrição**  
Criação da classe `Fornecedor` como uma subclasse da classe `Pessoa`. Adiciona atributos específicos e métodos adicionais.

**Atributos**
- `double valorCredito`
- `double valorDivida`

**Métodos**
- `getValorCredito()` e `setValorCredito()`
- `getValorDivida()` e `setValorDivida()`
- `obterSaldo()` - Calcula a diferença entre `valorCredito` e `valorDivida`
- Método `toString()` para exibir os detalhes do fornecedor

## Exercício 03

**Descrição**  
Criação da classe `Empregado` como uma subclasse da classe `Pessoa`. Adiciona atributos e métodos para cálculo de salário.

**Atributos**
- `int codigoSetor`
- `double salarioBase`
- `double imposto`

**Métodos**
- `getCodigoSetor()` e `setCodigoSetor()`
- `getSalarioBase()` e `setSalarioBase()`
- `getImposto()` e `setImposto()`
- `calcularSalario()` - Calcula o salário líquido
- Método `toString()` para exibir os detalhes do empregado

## Exercício 04

**Descrição**  
Criação da classe `Administrador` como uma subclasse da classe `Empregado`. Adiciona um atributo específico e redefine o método de cálculo de salário.

**Atributos**
- `double ajudaDeCusto`

**Métodos**
- `getAjudaDeCusto()` e `setAjudaDeCusto()`
- Redefinição do método `calcularSalario()` para incluir `ajudaDeCusto`
- Método `toString()` para exibir os detalhes do administrador

## Exercício 05

**Descrição**  
Criação da classe `Operario` como uma subclasse da classe `Empregado`. Adiciona atributos para calcular comissão sobre a produção.

**Atributos**
- `double valorProducao`
- `double comissao`

**Métodos**
- `getValorProducao()` e `setValorProducao()`
- `getComissao()` e `setComissao()`
- Redefinição do método `calcularSalario()` para incluir comissão
- Método `toString()` para exibir os detalhes do operário

## Exercício 06

**Descrição**  
Criação da classe `Vendedor` como uma subclasse da classe `Empregado`. Adiciona atributos para calcular comissão sobre as vendas.

**Atributos**
- `double valorVendas`
- `double comissao`

**Métodos**
- `getValorVendas()` e `setValorVendas()`
- `getComissao()` e `setComissao()`
- Redefinição do método `calcularSalario()` para incluir comissão sobre vendas
- Método `toString()` para exibir os detalhes do vendedor

  
