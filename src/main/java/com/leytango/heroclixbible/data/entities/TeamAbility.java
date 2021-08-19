package com.leytango.heroclixbible.data.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "team_ability")
public class TeamAbility implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    Subsection subsectionParent;

    @Column(nullable = false)
    String name;

    @Column(columnDefinition = "text", nullable = false)
    String description;

    @Column(name = "icon_image_url", nullable = false)
    String iconImageURL;

    @Column(nullable = false)
    String language;

    @Column(name = "order_showing")
    private int orderShowing;

    public int getOrderShowing() {
        return orderShowing;
    }

    public void setOrderShowing(int orderShowing) {
        this.orderShowing = orderShowing;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Subsection getSubsectionParent() {
        return subsectionParent;
    }

    public void setSubsectionParent(Subsection subsectionParent) {
        this.subsectionParent = subsectionParent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconImageURL() {
        return iconImageURL;
    }

    public void setIconImageURL(String iconImageUrl) {
        this.iconImageURL = iconImageUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
