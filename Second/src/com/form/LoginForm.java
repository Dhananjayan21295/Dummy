package com.form;

import org.apache.struts.action.ActionForm;

/**
 * Created by Dhananjayan on 5/5/2017.
 */
public class LoginForm extends ActionForm {

    final String originalUserId="hello";
    final String originalPassword="dear";

    private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginalUserId() {
        return originalUserId;
    }

    public String getOriginalPassword() {
        return originalPassword;
    }
}
