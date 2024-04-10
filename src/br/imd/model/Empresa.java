package br.imd.model;

import java.util.ArrayList;

public class Empresa {
  private static ArrayList<Funcionario> funcionarios;
  
  public Empresa() {
    funcionarios = new ArrayList<>();
  }

  public void listarFuncionarios() {
    for (Funcionario funcionario : funcionarios) {
      funcionario.imprimirDados();
    }
  }

  public double calcularFolhaPagamento() {
    double folhaPagamento = 0;
    for (Funcionario funcionario : funcionarios) {
      folhaPagamento += funcionario.calcularSalario();
    }
    return folhaPagamento;
  }

  public void exibirInformacoesFuncionarios() {
    for (Funcionario funcionario : funcionarios) {
      funcionario.imprimirDados();
    }
  }

  public void criarEmpresa(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  public void cadastrarFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

}
