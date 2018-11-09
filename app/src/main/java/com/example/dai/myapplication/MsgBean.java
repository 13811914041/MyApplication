package com.example.dai.myapplication;

import java.io.Serializable;

public class MsgBean implements Serializable {

    private String title;

    private String content;

    public MsgBean(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
