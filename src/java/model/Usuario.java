/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mi
 */
@XmlRootElement
public class Usuario implements Serializable{

    private Integer id;
    
    private String nome;
    private Boolean sexo;
    private String usuario;
    private String senha;
    private Boolean administrador;
    private Boolean professor;
    private Boolean aluno;
    private String email;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, Boolean sexo, String usuario, String senha, Boolean administrador, Boolean professor, Boolean aluno, String email) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.usuario = usuario;
        this.senha = senha;
        this.administrador = administrador;
        this.professor = professor;
        this.aluno = aluno;
        this.email = email;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getSexo() {
        return sexo;
    }
    
    public String getSexoString(){
        if(sexo)
            return "Masculino";
        else
            return "Feminino";
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }
    
    public String getAdministradorString(){
        if(administrador)
            return "Sim";
        else
            return "Não";
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public Boolean getProfessor() {
        return professor;
    }
    
    public String getProfessorString(){
        if(professor)
            return "Sim";
        else
            return "Não";
    }

    public void setProfessor(Boolean professor) {
        this.professor = professor;
    }

    public Boolean getAluno() {
        return aluno;
    }
    
    public String getAlunoString(){
        if(aluno)
            return "Sim";
        else
            return "Nâo";
    }

    public void setAluno(Boolean aluno) {
        this.aluno = aluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
