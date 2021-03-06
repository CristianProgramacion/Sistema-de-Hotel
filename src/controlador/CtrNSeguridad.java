/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Callback;

/**
 * Controlador de negocio Seguridad
 * @author Carlos Chavez Laguna
 */
public class CtrNSeguridad {

    
    private CtrLogin mCtrLogin;
    private CtrMantenerUsuario mCtrMantenerUsuario;
    private CtrVerPerfil mCtrVerPerfil;
    
    
    //constructor    
    public CtrNSeguridad() {
        //creación implicita de controladores
        mCtrLogin=new CtrLogin();
        mCtrMantenerUsuario=new CtrMantenerUsuario();
        mCtrVerPerfil=new CtrVerPerfil();
    }
    
    public CtrNSeguridad(CtrLogin ctrLogin) {
        mCtrLogin=ctrLogin;
    }
    
    //setters and getters
    public CtrLogin getCtrLogin() {
        return mCtrLogin;
    }

    public void setCtrLogin(CtrLogin ctrLogin) {
        this.mCtrLogin = ctrLogin;
    }

    public CtrMantenerUsuario getCtrMantenerUsuario() {
        return mCtrMantenerUsuario;
    }

    public void setCtrMantenerUsuario(CtrMantenerUsuario ctrMantenerUsuario) {
        this.mCtrMantenerUsuario = ctrMantenerUsuario;
    }

    public CtrVerPerfil getmCtrVerPerfil() {
        return mCtrVerPerfil;
    }

    public void setmCtrVerPerfil(CtrVerPerfil mCtrVerPerfil) {
        this.mCtrVerPerfil = mCtrVerPerfil;
    }
    
    /**
     * Agrega un callback(listener) para cuando
     * el login haya verificado la validez del 
     * usuario.
     * 
     * @param onUserLogged callback(listener)
     */
    public void setOnUserLogged(Callback onUserLogged) {
        mCtrLogin.setOnUserLogged(onUserLogged);
    }
    
    
    /**
     * showFrmLogin <br>
     * Permite mostrar el login
     *      
     */
    public void showFrmLogin(){
        mCtrLogin.showFrmLogin();
    }
    
    /**
     * mostrar el fomrulario mantener usuario
     */            
    public void showFrmMantenerUsuario(){
        mCtrMantenerUsuario.showFrmMantenerUsuario();
    }
    
    /**
     * mostrar el fomrulario mantener usuario
     */            
    public void showFrmVerPerfil(){
       mCtrVerPerfil.showFrmVerPerfil();
       mCtrVerPerfil.loadData();
    }
    
    /**
     * cargar los datos de los formularios
     */
    public void loadData(){
        mCtrMantenerUsuario.loadData();        
    }
}
