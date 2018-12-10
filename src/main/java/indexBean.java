import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "index", eager = true)
@RequestScoped
public class indexBean {
	private String username;
	private int password;
	
	public String getUsername() {
		return username;
	}
	

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String login()
	{
           FacesContext context = FacesContext.getCurrentInstance();
           context.getExternalContext().getSessionMap().put("username", username);
           return "login?faces-redirect=true";
	}
}
