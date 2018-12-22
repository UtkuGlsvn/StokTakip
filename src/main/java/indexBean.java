import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.password.Password;

import Database.LoginDAO;

@ManagedBean(name = "index", eager = true)
@RequestScoped
public class indexBean {
	private String username;
	private String password;
	
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

	public String login()
	{
	//	LoginDAO login = new LoginDAO();
	//	login.Control(username, password);
           FacesContext context = FacesContext.getCurrentInstance();
           context.getExternalContext().getSessionMap().put("username", username);
           return "login?faces-redirect=true";
	}
}
