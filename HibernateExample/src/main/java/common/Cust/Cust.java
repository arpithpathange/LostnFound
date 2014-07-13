package common.Cust;

import java.io.Serializable;

/**
 * Created by arpith on 13/7/14.
 */
public class Cust implements Serializable{

    private int n_telePhone;
    private String email;

    Cust(int tele,String email){
        this.n_telePhone = tele;
        this.email = email;
    }

    public void setTelephone(int tele){
        this.n_telePhone = tele;
    }

    public int getTelephone(){
        return this.n_telePhone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }




}
