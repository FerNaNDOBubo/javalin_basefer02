package br.edu.ifpr.pgua.eic.tads.controllers;

import br.edu.ifpr.pgua.eic.tads.models.Gerenciador;
import io.javalin.http.Context;

public class CadastroController {

    private Gerenciador gerenciador;

    public CadastroController(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;

    }    

    public void get(Context ctx){
        ctx.render("cadastro.html");
    }
    
    public void getFuncionario(Context ctx){
        ctx.render("cadastro-funcionario.html");
    }

    public void post(Context ctx) {
        String nome = ctx.formParam("nome");
        String email = ctx.formParam("email");

        String ret = gerenciador.adicionar(nome, email);
        
        ctx.result(gerenciador.listarUsuarios());

    }    

    public void postFuncionario(Context ctx) {
        String nome = ctx.formParam("nome");
        String cargo = ctx.formParam("cargo");
        double salario = Double.parseDouble(ctx.formParam("salario"));
        String turno = ctx.formParam("turno");

        String ret = gerenciador.adicionarFuncionario(nome, cargo, salario, turno);
        
        ctx.result(gerenciador.listarFuncionarios());

    }


}    