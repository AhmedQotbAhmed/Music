
package com.example.music.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LifeSpan {

    @SerializedName("end")
    @Expose
    private String end;
    @SerializedName("ended")
    @Expose
    private Boolean ended;
    @SerializedName("begin")
    @Expose
    private String begin;

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Boolean getEnded() {
        return ended;
    }

    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

}
