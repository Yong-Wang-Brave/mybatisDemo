package org.java.mybatis.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 8596421348439484783L;

    public int getIdId() {
        return idId;
    }

    public void setIdId(int idId) {
        this.idId = idId;
    }

    private int idId;
    private String userName;
    private String sex;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

