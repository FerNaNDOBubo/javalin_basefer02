package br.edu.ifpr.pgua.eic.tads.models;

import java.util.ArrayList;

import br.edu.ifpr.pgua.eic.tads.models.entities.Funcionario;
import br.edu.ifpr.pgua.eic.tads.models.entities.Usuario;

public class Gerenciador {
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Funcionario> funcionarios;

    
    public Gerenciador(){
        usuarios = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    public String adicionar(String nome, String email){
        usuarios.add(new Usuario(nome, email));
        return "Cadastrado!";
    }

    public String adicionarFuncionario(String nome, String cargo, double salario, String turno){
        funcionarios.add(new Funcionario(nome, cargo, salario, turno));
        return "Cadastrado!";
    }

    public String listarUsuarios(){
        String ret="";

        for(Usuario u:usuarios){
            ret +="->"+u.getNome()+";"+u.getEmail()+"\n";
        }
        return ret;
    }

    public String listarFuncionarios(){
        String ret="";

        for(Funcionario f:funcionarios){
            ret +="->"+f.getNome()+";"+f.getCargo()+";"+f.getSalario()+";"+f.getTurno()+"\n";
        }
        return ret;
    }

}    