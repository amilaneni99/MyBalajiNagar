package com.abhinav.mybalajinagar;

public class Image {
    String url;
    String title;
    String desc;

    public Image(String url, String title, String desc) {
        this.url = url;
        this.title = title;
        this.title = desc;
    }

    public Image(){
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
