package br.edu.ifpr.pgua.eic.tads;

import br.edu.ifpr.pgua.eic.tads.controllers.CadastroController;
import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.models.entities.Gerenciador;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        var app = JavalinUtils.makeApp(9100);
        
        Gerenciador gerenciador = new Gerenciador();

        IndexController indexController = new IndexController();
        CadastroController cadastroController = new CadastroController(gerenciador);

        app.get("/",indexController::get);
    
        app.get("/usuarios/cadastro", cadastroController::get);
        app.post("/usuarios/cadastro", cadastroController::post);

    }
}
