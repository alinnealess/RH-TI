package br.imd.model;

public abstract class Funcionario {
  protected String nome;
  protected String cpf;
  protected int matricula;
  protected String dataNascimento;
  public static final Double SALARIO_MINIMO = 1045.00;


  public Funcionario(String nome, String cpf, int matricula, String dataNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.matricula = matricula;
    this.dataNascimento = dataNascimento;
  }

  public abstract double calcularSalario();

  public abstract void imprimirDados();
}
