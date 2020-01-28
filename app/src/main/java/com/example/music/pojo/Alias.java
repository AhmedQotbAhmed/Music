
package com.example.music.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alias {

    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("end")
    @Expose
    private Object end;
    @SerializedName("sort-name")
    @Expose
    private String sortName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("ended")
    @Expose
    private Boolean ended;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("begin")
    @Expose
    private Object begin;
    @SerializedName("type-id")
    @Expose
    private String typeId;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Object getEnd() {
        return end;
    }

    public void setEnd(Object end) {
        this.end = end;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnded() {
        return ended;
    }

    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getBegin() {
        return begin;
    }

    public void setBegin(Object begin) {
        this.begin = begin;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

}
