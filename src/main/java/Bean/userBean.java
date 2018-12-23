package Bean;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Database.DatabaseConnect;
import Database.UserDAO;


@ManagedBean(name = "userbean", eager = true)
@RequestScoped
public class userBean {
	private int id;  
	private String ad; 
	private String soyad; 
	private String username; 
	private String password;
	private int yetki_id;
	
    private ArrayList userList;
	
	DatabaseConnect conn = new DatabaseConnect();
	UserDAO userdao = new UserDAO();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getYetki_id() {
		return yetki_id;
	}
	public void setYetki_id(int yetki_id) {
		this.yetki_id = yetki_id;
	}
	
    @PostConstruct
	  public void listUser() {
    setUserList(userdao.getUserlist(conn));		  
	  }
    public ArrayList getUserList() {
		return userList;
	}
	public void setUserList(ArrayList userList) {
		this.userList = userList;
	}
}
