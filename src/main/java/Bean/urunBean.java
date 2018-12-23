package Bean;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Database.DatabaseConnect;
import Database.ProductDAO;

@ManagedBean(name = "urunbean", eager = true)
@RequestScoped
public class urunBean {
	private int id;  
	private String urun_ad; 
	private String barkod_no; 
	private String u_tarihi; 
	private String s_tarihi;
	private String fiyat;
	private int depo_id;
	
    private ArrayList urunList;
	
	DatabaseConnect conn = new DatabaseConnect();
	ProductDAO productdao = new ProductDAO();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrun_ad() {
		return urun_ad;
	}
	public void setUrun_ad(String urun_ad) {
		this.urun_ad = urun_ad;
	}
	public String getBarkod_no() {
		return barkod_no;
	}
	public void setBarkod_no(String barkod_no) {
		this.barkod_no = barkod_no;
	}
	public String getU_tarihi() {
		return u_tarihi;
	}
	public void setU_tarihi(String u_tarihi) {
		this.u_tarihi = u_tarihi;
	}
	public String getS_tarihi() {
		return s_tarihi;
	}
	public void setS_tarihi(String s_tarihi) {
		this.s_tarihi = s_tarihi;
	}
	public String getFiyat() {
		return fiyat;
	}
	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}
	public int getDepo_id() {
		return depo_id;
	}
	public void setDepo_id(int depo_id) {
		this.depo_id = depo_id;
	}
	public ArrayList getUrunList() {
		return urunList;
	}
	public void setUrunList(ArrayList urunList) {
		this.urunList = urunList;
	}
	
	@PostConstruct
	  public void listProduct() {
		setUrunList(productdao.geProductlist(conn));		  
	  }
  public ArrayList getUserList() {
		return urunList;
	}
	public void setUserList(ArrayList userList) {
		this.urunList = userList;
	}
	
}
