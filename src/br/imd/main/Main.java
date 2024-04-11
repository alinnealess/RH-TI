package br.imd.main;

import br.imd.model.Empresa;
import br.imd.model.Gerente;
import br.imd.model.Programador;

public class Main {
  public static void main(String[] args) {

    // Instanciando a empresa
    Empresa imdCorp = new Empresa();

    // Cadastrando funcionários
    imdCorp.cadastrarFuncionario(new Programador("João", "123.456.789-00", 123, "01/01/1990", "Projeto 1"));
    imdCorp.cadastrarFuncionario(new Gerente("Francisco", "086.074.856-69", 125, "25/02/1990", "Matematica"));

    imdCorp.exibirInformacoesFuncionarios();
    System.out.println("\nFolha de pagamento da ImdCorp: R$ " + imdCorp.calcularFolhaPagamento());
  }

}
