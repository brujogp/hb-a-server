package com.leytango.heroclixbible.data.entities.atas;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.leytango.heroclixbible.data.entities.Subsection;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "atas")
public class Ata implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "text", nullable = false)
    private String description;

    @Column(name = "background_image_url")
    private String backgroundImageUrl;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int cost;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    Subsection subsectionParent;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Keyword> keywords;

    @Column(name = "order_showing")
    private int orderShowing;

    public int getOrderShowing() {
        return orderShowing;
    }

    public void setOrderShowing(int orderShowing) {
        this.orderShowing = orderShowing;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public Subsection getSubsectionParent() {
        return subsectionParent;
    }

    public void setSubsectionParent(Subsection subsectionParent) {
        this.subsectionParent = subsectionParent;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public void setBackgroundImageUrl(String backgroundImageUrl) {
        this.backgroundImageUrl = backgroundImageUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
