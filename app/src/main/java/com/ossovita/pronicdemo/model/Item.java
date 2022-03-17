package com.ossovita.pronicdemo.model;

import com.google.gson.annotations.SerializedName;

public class Item {


    @SerializedName("name")
    private String name;

    @SerializedName("value")
    private Object value;

    public Item(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
