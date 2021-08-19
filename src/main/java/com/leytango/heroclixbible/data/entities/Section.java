package com.leytango.heroclixbible.data.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sections")
public class Section implements Serializable {
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

    @Column(nullable = false)
    private String acronym;

    @Column(name = "icon_url")
    private String iconURL;

    @Column(name="order_showing")
    private int orderShowing;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "parentSection")
    @JsonManagedReference
    private List<Subsection> childSubsectionsList = new ArrayList<Subsection>();

    public int getOrderShowing() {
        return orderShowing;
    }

    public void setOrderShowing(int orderShowing) {
        this.orderShowing = orderShowing;
    }

    public List<Subsection> getChildSubsectionsList() {
        return childSubsectionsList;
    }

    public void setChildSubsectionsList(List<Subsection> childSubsectionsList) {
        this.childSubsectionsList = childSubsectionsList;
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

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String baseURLMedia) {
        this.iconURL = baseURLMedia;
    }

    public void addSubsection(Subsection subsection){
       this.childSubsectionsList.add(subsection);
    }
}


