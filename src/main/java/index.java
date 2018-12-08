/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Glsvn
 */
@ManagedBean
@Named(value = "index")
@Dependent

public class index {

   private String username;
   private int password;
    public index() {
    }
    public String login()
    {
         return  "login.jsf";
    }
}
