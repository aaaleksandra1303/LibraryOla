package libraryola.akademiakodu.pl.libraryola;

import android.content.Intent;

/**
 * Created by Ale on 2016-10-01.
 */

public class Users {
    String login,password;



    Integer telefonNumber;

    public Users(String login, String password, Integer telefonNumber)
    {
        this.login=login;
        this.password=password;
        this.telefonNumber=telefonNumber;

    }


    public Integer getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(Integer telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }




}
