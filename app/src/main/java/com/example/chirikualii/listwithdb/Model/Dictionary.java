package com.example.chirikualii.listwithdb.Model;

/**
 * Created by chirikualii on 19/03/18.
 */

public class Dictionary {
    private String title;
    private String desc;

    public Dictionary(){

    }
    public Dictionary(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
