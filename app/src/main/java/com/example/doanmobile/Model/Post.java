package com.example.doanmobile.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
public class Post {
    private String postid;
    private String postimage;
    private String description;
    private String publisher;
    private String publish_date;
    private ArrayList<String> like;
    private ArrayList<String> save;

    public String getPublish_date()
    {
        return publish_date;
    }
    public void setPublish_date(String publish_date)
    {
        this.publish_date = publish_date;
    }
    public ArrayList<String> getLike()
    {
        return like;
    }

    public void setLike(ArrayList<String> like)
    {
        this.like = like;
    }

    public ArrayList<String> getSave()
    {
        return save;
    }

    public void setSave(ArrayList<String> save)
    {
        this.save = save;
    }


    public Post() {
    }

    public Post(String postid, String postimage, String description, String publisher) {
        this.postid = postid;
        this.postimage = postimage;
        this.description = description;
        this.publisher = publisher;
        like = new ArrayList<String>();
        save = new ArrayList<String>();

        publish_date = LocalDate.now().toString();

    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPostimage() {
        return postimage;
    }

    public void setPostimage(String postimage) {
        this.postimage = postimage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
