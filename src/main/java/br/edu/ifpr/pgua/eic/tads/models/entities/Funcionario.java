package br.edu.ifpr.pgua.eic.tads.models.entities;

public class Funcionario {
   private String nome;
   private String cargo;  
   private double salario;
   private String turno;

   public Funcionario(String nome, String cargo, double salario, String turno){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.turno = turno;
   }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
