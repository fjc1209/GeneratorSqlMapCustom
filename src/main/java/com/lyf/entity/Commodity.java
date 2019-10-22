package com.lyf.entity;

public class Commodity {
    private String id;

    private String name;

    private Integer type;

    private Float oldprice;

    private Float newprice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getOldprice() {
        return oldprice;
    }

    public void setOldprice(Float oldprice) {
        this.oldprice = oldprice;
    }

    public Float getNewprice() {
        return newprice;
    }

    public void setNewprice(Float newprice) {
        this.newprice = newprice;
    }
}