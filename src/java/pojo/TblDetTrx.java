package pojo;
// Generated Oct 3, 2022 3:35:44 PM by Hibernate Tools 4.3.1



/**
 * TblDetTrx generated by hbm2java
 */
public class TblDetTrx  implements java.io.Serializable {


     private String trxId;
     private String bukuId;
     private int qty;
     private double harga;

    public TblDetTrx() {
    }

    public TblDetTrx(String trxId, String bukuId, int qty, double harga) {
       this.trxId = trxId;
       this.bukuId = bukuId;
       this.qty = qty;
       this.harga = harga;
    }
   
    public String getTrxId() {
        return this.trxId;
    }
    
    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }
    public String getBukuId() {
        return this.bukuId;
    }
    
    public void setBukuId(String bukuId) {
        this.bukuId = bukuId;
    }
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getHarga() {
        return this.harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }




}


