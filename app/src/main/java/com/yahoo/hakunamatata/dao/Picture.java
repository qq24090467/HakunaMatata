package com.yahoo.hakunamatata.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PICTURE.
 */
public class Picture {

    private Long internalId;
    private String id;
    private String url;

    public Picture() {
    }

    public Picture(Long internalId) {
        this.internalId = internalId;
    }

    public Picture(Long internalId, String id, String url) {
        this.internalId = internalId;
        this.id = id;
        this.url = url;
    }

    public Long getInternalId() {
        return internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}