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
public class Curso implements Serializable{
    
    private Integer id;
    private String nome;
    private String tipoCurso;
    private Integer cargaHoraria;
    private Integer semestres;

    public Curso() {
    }

    public Curso(Integer id, String nome, String tipoCurso, Integer cargaHoraria, Integer semestres) {
        this.id = id;
        this.nome = nome;
        this.tipoCurso = tipoCurso;
        this.cargaHoraria = cargaHoraria;
        this.semestres = semestres;
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

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getSemestres() {
        return semestres;
    }

    public void setSemestres(Integer semestres) {
        this.semestres = semestres;
    }
    
}
