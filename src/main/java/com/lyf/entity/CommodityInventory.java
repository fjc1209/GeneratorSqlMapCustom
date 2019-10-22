package com.lyf.entity;

public class CommodityInventory {
    private String id;

    private Integer inventory;

    private Integer sellnumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getSellnumber() {
        return sellnumber;
    }

    public void setSellnumber(Integer sellnumber) {
        this.sellnumber = sellnumber;
    }
}