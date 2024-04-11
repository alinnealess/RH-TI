package br.imd.model;

public class Gerente extends Funcionario {
  public String departamento;

  public Gerente(String nome, String cpf, int matricula, String dataNascimento, String departamento) {
    super(nome, cpf, matricula, dataNascimento);
    this.departamento = departamento;
  }

  @Override
  public double calcularSalario() {
    return SALARIO_MINIMO * 5;
  }

  @Override
  public void imprimirDados() {
    String info0 = "\n#-------------------------------------\n";
    String info1 = "Nome: " + this.nome + 
                    "\nCPF: " + this.cpf + 
                    "\nData da nascimento: " + this.dataNascimento;
    String info2 = "\nDepartamento: " + this.departamento + 
                    "\nSalario: " + calcularSalario();
    System.out.println(info0 + info1 + info2);
  }

}
