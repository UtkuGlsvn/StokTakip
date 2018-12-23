package Bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.component.password.Password;

import Database.DatabaseConnect;
import Database.LoginDAO;

@ManagedBean(name = "index", eager = true)
@RequestScoped
public class indexBean {
	private String username;
	private String password;
	DatabaseConnect conn = new DatabaseConnect();
	LoginDAO login = new LoginDAO();
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
	
	
	public String validateUsernamePassword() {
		boolean valid = login.Control(username, password, conn);
		if (valid) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", username);
	        return "login?faces-redirect=true";	
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Sifre veya kullanıcı adınız yanlış!",
							"Lütfen doğru kullanıcı adı ve şifreyi giriniz."));
			return null;
		}
	}

	//logout event, invalidate session
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login";
	}
}
