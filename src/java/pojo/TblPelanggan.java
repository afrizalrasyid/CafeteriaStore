package pojo;
// Generated Oct 3, 2022 3:35:44 PM by Hibernate Tools 4.3.1

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import DAO.DAOPelanggan;




@ManagedBean
public class TblPelanggan  implements java.io.Serializable {


     private String idPelanggan;
     private String nama;
     private String alamat;
     private String noTelp;
     private String email;

    public TblPelanggan() {
    }

    public TblPelanggan(String idPelanggan, String nama, String alamat, String noTelp, String email) {
       this.idPelanggan = idPelanggan;
       this.nama = nama;
       this.alamat = alamat;
       this.noTelp = noTelp;
       this.email = email;
    }
   
    public String getIdPelanggan() {
        return this.idPelanggan;
    }
    
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNoTelp() {
        return this.noTelp;
    }
    
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void save(){
        DAOPelanggan plg = new DAOPelanggan();
        plg.addPelanggan(this);
    }
    
    public void update() {
        DAOPelanggan plg = new DAOPelanggan();
        plg.updatePelanggan(this);
        nama = "";
        alamat = "";
        email = "";
        noTelp = "";
        idPelanggan = "";
    }

    public void delete() {
        DAOPelanggan plg = new DAOPelanggan();
        plg.deletePelanggan(idPelanggan);
        nama = "";
        alamat = "";
        email = "";
        noTelp = "";
        idPelanggan = "";
    }
    
    public String getbyid(){
        DAOPelanggan plg = new DAOPelanggan();
        List<TblPelanggan> lPlg = plg.getbyID(idPelanggan);
        nama = lPlg.get(0).nama;
        alamat = lPlg.get(0).alamat;
        email = lPlg.get(0).email;
        noTelp = lPlg.get(0).noTelp;
        return "view_pelanggan";
    }
    
    public List<TblPelanggan> getallrecords() {
        DAOPelanggan plg = new DAOPelanggan();
        List<TblPelanggan> lPlg = plg.retrieveTblPelanggan();
        return lPlg;
    }
}


