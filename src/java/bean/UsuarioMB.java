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
import model.Usuario;
import ws.ClienteUsuario;

/**
 *
 * @author mi
 */
@Named(value = "usuarioMB")
@SessionScoped
public class UsuarioMB implements Serializable {

    /**
     * Creates a new instance of UsuarioMB
     */
    
    private List<Usuario> listaUsuarios;
    private ClienteUsuario clienteUsuario;
    private Usuario usuario;
    private String mensagemErro;
    public UsuarioMB() {
        usuario = new Usuario();
        clienteUsuario = new ClienteUsuario();
        listaUsuarios = atualizaLista();
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ClienteUsuario getClienteUsuario() {
        return clienteUsuario;
    }

    public void setClienteUsuario(ClienteUsuario clienteUsuario) {
        this.clienteUsuario = clienteUsuario;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String editarUsuario(Usuario u){
        usuario = u;
        return "editaUsuario";
    }
    
    public String alterarUsuario(){
        clienteUsuario.alterarUsuario(usuario, usuario.getId().toString());
        listaUsuarios = atualizaLista();
        return "usuario";
    }
    
    public void excluirUsuario(Usuario u){
        clienteUsuario.removerUsuario(new GenericType<Usuario>(){}, u.getId().toString());
        listaUsuarios = atualizaLista();
    }
    
    public String criarUsuario(){
        usuario = new Usuario();
        return "criaUsuario";
    }
    
    public String adicionarUsuario(){
        clienteUsuario.adicionarUsuario(usuario);
        listaUsuarios = atualizaLista();
        return "usuario";
    }
    
    public List<Usuario>atualizaLista(){
        return clienteUsuario.getUsuarios(new GenericType<List<Usuario>>(){});
    }
    
}
