# Sistema de RH para Empresa de TI

## Descrição

Este projeto em Java implementa um sistema de Recursos Humanos (RH) para uma empresa de Tecnologia da Informação (TI), utilizando conceitos de herança, abstração, e collections. O sistema é capaz de gerenciar funcionários, calcular a folha de pagamento total da empresa, e exibir informações detalhadas dos funcionários.

## Estrutura do Projeto

### Classe Abstrata `Funcionario`

A classe abstrata `Funcionario` serve como base para todos os tipos de funcionários na empresa. Ela define atributos comuns a todos os funcionários, como nome, CPF, matrícula e data de nascimento. Além disso, contém métodos abstratos para calcular o salário e exibir informações do funcionário, obrigando as subclasses a implementá-los.

#### Atributos

- `nome`: String
- `cpf`: String
- `matricula`: String
- `dataNascimento`: String

#### Métodos Abstratos

- `calcularSalario()`: Retorna o salário do funcionário como um `double`.
- `imprimirDados()`: Imprime informações do funcionário.

### Subclasses de `Funcionario`

#### `Gerente`

Esta classe representa um funcionário com o cargo de Gerente. Além dos atributos herdados de `Funcionario`, possui um atributo adicional:

- `departamento`: String

Implementa os métodos abstratos para calcular o salário e exibir as informações de acordo com as regras específicas para gerentes.

#### `Programador`

Esta classe representa um funcionário com o cargo de Programador. Possui um atributo adicional:

- `projetoAssociado`: String

Similarmente ao Gerente, implementa os métodos abstratos para calcular o salário e exibir as informações, focando nas especificidades do cargo de Programador.

### Classe `Empresa`

A classe `Empresa` utiliza uma coleção (ArrayList) para armazenar objetos do tipo `Funcionario`. Inclui métodos para adicionar funcionários à lista, calcular a folha de pagamento total e exibir informações de todos os funcionários.

### Programa Principal (`Main`)

O programa principal demonstra o funcionamento do sistema, instanciando objetos de diferentes tipos de funcionários (Gerente, Programador), adicionando-os a uma instância da classe `Empresa`, e então calculando e exibindo a folha de pagamento total e as informações de todos os funcionários.

## Como Executar

Para executar este projeto, você precisará de um ambiente capaz de compilar e executar código Java, como o JDK. Compile as classes e execute a classe `Main` para ver o sistema em ação.

## Conclusão

Este sistema de RH para uma empresa de TI demonstra o uso de conceitos importantes de programação orientada a objetos, como herança, abstração e o uso de collections, fornecendo uma base sólida para sistemas mais complexos e expansíveis.
