package com.company.atomicbotadmin.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "ATOMICBOTADMIN_NEWS_ITEM")
@Entity(name = "atomicbotadmin_NewsItem")
@NamePattern("%s|header")
public class NewsItem extends StandardEntity {
    private static final long serialVersionUID = -3077068241340636919L;

    @NotNull
    @Column(name = "DATE_", nullable = false)
    private LocalDateTime date;

    @NotNull
    @Column(name = "HEADER", nullable = false)
    private String header;

    @NotNull
    @Lob
    @Column(name = "PREVIEW_TEXT", nullable = false)
    private String previewText;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_ID")
    private FileDescriptor image;

    @Column(name = "LINK_TO_ORIGINAL")
    private String linkToOriginal;

    @Column(name = "HASH_TAGS")
    private String hashTags;

    public String getHashTags() {
        return hashTags;
    }

    public void setHashTags(String hashTags) {
        this.hashTags = hashTags;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getLinkToOriginal() {
        return linkToOriginal;
    }

    public void setLinkToOriginal(String linkToOriginal) {
        this.linkToOriginal = linkToOriginal;
    }

    public FileDescriptor getImage() {
        return image;
    }

    public void setImage(FileDescriptor image) {
        this.image = image;
    }

    public String getPreviewText() {
        return previewText;
    }

    public void setPreviewText(String previewText) {
        this.previewText = previewText;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}