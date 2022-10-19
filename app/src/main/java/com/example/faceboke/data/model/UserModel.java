package com.example.faceboke.data.model;

public class UserModel {
    private int userImage,postImage;
    private String userName,postTime,postContent;

    public UserModel(int userImage, int postImage, String userName, String postTime, String postContent) {
        this.userImage = userImage;
        this.postImage = postImage;
        this.userName = userName;
        this.postTime = postTime;
        this.postContent = postContent;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
