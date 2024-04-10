package br.imd.model;

public class Programador extends Funcionario{
  public String projetoAssociado;

  public Programador(String nome, String cpf, int matricula, String dataNascimento, String projetoAssociado) {
    super(nome, cpf, matricula, dataNascimento);
    this.projetoAssociado = projetoAssociado;
  }

  @Override
  public double calcularSalario() {
    return SALARIO_MINIMO * 3;
  }

  @Override
  public void imprimirDados() {
    String info0 = "\n###############################################\n";
    String info1 = "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nData da nascimento: " + this.dataNascimento;
    String info2 = "\nProjeto Associado: " + this.projetoAssociado + "\nSalario: " + calcularSalario();
    System.out.println(info0 + info1 + info2);
  }

  


}
