package com.leytango.heroclixbible.data.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.leytango.heroclixbible.data.entities.atas.Ata;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "subsections")
public class Subsection implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(name = "last_update", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date lastUpdate;

    @Column(nullable = false)
    private String language;

    @Column(name = "icon_url", nullable = false)
    private String iconURL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Section parentSection;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "subsectionParent")
    @JsonManagedReference
    private List<PowerAndAbility> paaList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "subsectionParent")
    @JsonManagedReference
    private List<TeamAbility> taList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "subsectionParent")
    @JsonManagedReference
    private List<Ata> atasList;

    @Column(name="order_showing")
    private int orderShowing;

    public int getOrderShowing() {
        return orderShowing;
    }

    public void setOrderShowing(int orderShowing) {
        this.orderShowing = orderShowing;
    }

    public List<TeamAbility> getTaList() {
        return taList;
    }

    public void setTaList(List<TeamAbility> taList) {
        this.taList = taList;
    }

    public List<PowerAndAbility> getPaaList() {
        return paaList;
    }

    public void setPaaList(List<PowerAndAbility> paa) {
        this.paaList = paa;
    }

    public List<Ata> getAtasList() {
        return atasList;
    }

    public void setAtasList(List<Ata> atasList) {
        this.atasList = atasList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String baseURLMedia) {
        this.iconURL = baseURLMedia;
    }

    public Section getParentSection() {
        return parentSection;
    }

    public void setParentSection(Section parentSection) {
        this.parentSection = parentSection;
    }
}

