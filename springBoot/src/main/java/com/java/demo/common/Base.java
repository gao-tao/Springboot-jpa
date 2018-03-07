package com.java.demo.common;

import java.io.Serializable;

/**
 * Created by GaoTao on 2017/12/19.
 */
public class Base implements Serializable{

    private String createdTime;
    private String updateTime;

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
