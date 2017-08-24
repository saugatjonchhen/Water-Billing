/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.model;

/**
 *
 * @author Saugat
 */
public class AdminLogin {
    private int useId;
    private String userName;
    private String password;

    /**
     * @return the useId
     */
    public int getUseId() {
        return useId;
    }

    /**
     * @param useId the useId to set
     */
    public void setUseId(int useId) {
        this.useId = useId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
