
package com.example.music.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicBrainz {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("life-span")
    @Expose
    private LifeSpan lifeSpan;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("gender-id")
    @Expose
    private Object genderId;
    @SerializedName("isnis")
    @Expose
    private List<String> isnis = null;
    @SerializedName("end_area")
    @Expose
    private Object endArea;
    @SerializedName("aliases")
    @Expose
    private List<Alias> aliases = null;
    @SerializedName("type-id")
    @Expose
    private String typeId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("disambiguation")
    @Expose
    private String disambiguation;
    @SerializedName("ipis")
    @Expose
    private List<Object> ipis = null;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("sort-name")
    @Expose
    private String sortName;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("area")
    @Expose
    private Area area;
    @SerializedName("begin_area")
    @Expose
    private BeginArea beginArea;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LifeSpan getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(LifeSpan lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getGenderId() {
        return genderId;
    }

    public void setGenderId(Object genderId) {
        this.genderId = genderId;
    }

    public List<String> getIsnis() {
        return isnis;
    }

    public void setIsnis(List<String> isnis) {
        this.isnis = isnis;
    }

    public Object getEndArea() {
        return endArea;
    }

    public void setEndArea(Object endArea) {
        this.endArea = endArea;
    }

    public List<Alias> getAliases() {
        return aliases;
    }

    public void setAliases(List<Alias> aliases) {
        this.aliases = aliases;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisambiguation() {
        return disambiguation;
    }

    public void setDisambiguation(String disambiguation) {
        this.disambiguation = disambiguation;
    }

    public List<Object> getIpis() {
        return ipis;
    }

    public void setIpis(List<Object> ipis) {
        this.ipis = ipis;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public BeginArea getBeginArea() {
        return beginArea;
    }

    public void setBeginArea(BeginArea beginArea) {
        this.beginArea = beginArea;
    }

}
