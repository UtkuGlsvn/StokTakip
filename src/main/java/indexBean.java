import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "index", eager = true)
@RequestScoped
public class indexBean {
	private String username;
	private int password;
	public String login()
	{
	      return "login";
	}
}
