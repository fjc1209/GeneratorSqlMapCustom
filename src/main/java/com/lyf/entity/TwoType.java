package com.lyf.entity;

public class TwoType {
    private Integer id;

    private Integer oneid;

    private String typename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOneid() {
        return oneid;
    }

    public void setOneid(Integer oneid) {
        this.oneid = oneid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}