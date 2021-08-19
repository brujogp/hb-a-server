package com.leytango.heroclixbible.data.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.leytango.heroclixbible.utilities.ManipulateStringClass;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "paa_item")
public class PowerAndAbility implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    Subsection subsectionParent;

    @Transient
    private ManipulateStringClass decoder;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "text", nullable = false)
    private String description;

    @Column(name = "icon_image_url", nullable = false)
    private String iconImageURL;

    @Column(name = "alternative_name")
    private String alternativeName;

    @Column(name = "language", nullable = false)
    private String language;

    @Column(name = "order_showing")
    private int orderShowing;


    public int getOrderShowing() {
        return orderShowing;
    }

    public void setOrderShowing(int orderShowing) {
        this.orderShowing = orderShowing;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String languageAb) {
        this.language = languageAb;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
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
        return ManipulateStringClass.modifyDescription(this.description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconImageURL() {
        return iconImageURL;
    }

    public void setIconImageURL(String iconPath) {
        this.iconImageURL = iconPath;
    }


}
