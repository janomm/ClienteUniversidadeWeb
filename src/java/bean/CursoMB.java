/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ws.rs.core.GenericType;
import model.Curso;
import ws.ClienteCurso;

/**
 *
 * @author mi
 */
@Named(value = "cursoMB")
@SessionScoped
public class CursoMB implements Serializable {

    /**
     * Creates a new instance of CursoMB
     */
    
    private List<Curso> listaCursos;
    private ClienteCurso clienteCurso;
    private Curso curso;
    private String mensagemErro;
    public CursoMB() {
        curso = new Curso();
        clienteCurso = new ClienteCurso();
        listaCursos = atualizaLista();     
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public ClienteCurso getClienteCurso() {
        return clienteCurso;
    }

    public void setClienteCurso(ClienteCurso clienteCurso) {
        this.clienteCurso = clienteCurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }
    
    public String editarCurso(Curso c){
        curso = c;
        return "editaCurso";
    }
    
    public String alterarCurso(){
        clienteCurso.alterarCurso(curso, curso.getId().toString());
        listaCursos = atualizaLista();
        return "curso";
    }
    
    public void excluirCurso(Curso c){
        clienteCurso.removerCurso(new GenericType<Curso>(){}, c.getId().toString());
        listaCursos = atualizaLista();
    }
    
    public String criarCurso(){
        curso = new Curso();
        return "criaCurso";
    }
    
    public String adicionarCurso(){
        curso.setTipoCurso("Graduação");
        clienteCurso.adicionarCurso(curso);
        listaCursos = atualizaLista();
        return "curso";
    }
    
    public List<Curso>atualizaLista(){
        return clienteCurso.getCursos(new GenericType<List<Curso>>(){});
    }
    
}
