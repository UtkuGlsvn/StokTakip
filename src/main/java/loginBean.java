import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "login", eager = true)
@RequestScoped
public class loginBean {
    private int activeindex;

    public int getActiveindex() {
    return activeindex;
    }

    public void setActiveindex(int activeindex) {
        this.activeindex = activeindex;
    }  
   public String Dirige(int a){
   setActiveindex(a);
    if (a == 0) {
         return "/login.xhtml";
      }
   if (a == 1) {
      return "/urunIslem.xhtml";
   }
    if (a == 2) {
         return "/kullaniciIslem.xhtml";
      }
     if (a == 3) {
         return "index.xhtml";
      }
    else{
       return null;
      }
   }
}
