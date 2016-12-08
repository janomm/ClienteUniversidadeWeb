/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author mi
 */
@Named(value = "controlerMB")
@SessionScoped
public class ControlerMB implements Serializable {

    /**
     * Creates a new instance of ControlerMB
     */
    public ControlerMB() {
    }
    
    
    public String linkUsuario(){
        return "usuario";
    }
    
    public String linkCurso(){
        return "curso";
    }
    
    public String linkInicio(){
        return "index";
    }
    
}
