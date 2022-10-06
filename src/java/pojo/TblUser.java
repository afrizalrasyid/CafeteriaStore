package pojo;
// Generated Oct 3, 2022 3:35:44 PM by Hibernate Tools 4.3.1

import DAO.DAOLogin;
import java.util.List;
import javax.faces.bean.ManagedBean;




@ManagedBean
public class TblUser  implements java.io.Serializable {


     private Integer idUser;
     private String username;
     private String password;
     private String role;

    public TblUser() {
    }

    public TblUser(String username, String password, String role) {
       this.username = username;
       this.password = password;
       this.role = role;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String validasiLogin(){
        DAOLogin uDao = new DAOLogin();
        List<TblUser> us = uDao.getBy(username, password);
        if (us != null) {
            username = us.get(0).username;
            password = us.get(0).password;
            role = us.get(0).role;
            return "view_pelanggan";
        }
        return "error";
    }
}


