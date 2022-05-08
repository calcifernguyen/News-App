package com.mad12.newsapp.model;

import androidx.annotation.NonNull;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import java.lang.annotation.Inherited;
import java.time.LocalDateTime;

public class Article {
    @SerializedName("_id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("img")
    private String img;
    @SerializedName("content")
    private String content;
    private LocalDateTime publishedAt;
    @SerializedName("category")
    private String category;

    public Article(String s, String s1, String s2) {
        this.title=s;
        this.img=s1;
        this.content=s2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", content='" + content + '\'' +
                ", publishedAt=" + publishedAt +
                '}';
    }

}
