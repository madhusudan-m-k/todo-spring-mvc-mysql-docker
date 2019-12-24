/**
 *  Model class for Login.
 */

package com.docker.todo.webapp.model;

import java.util.Date;

/**
 * POJO class for Login.
 * 
 * @author satya
 *
 */
public class LoginModel {

    private String userName;

    private String password;

    private Date loginDateTime;

    public LoginModel() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLoginDateTime() {
        return loginDateTime;
    }

    public void setLoginDateTime(Date loginDateTime) {
        this.loginDateTime = loginDateTime;
    }
}
