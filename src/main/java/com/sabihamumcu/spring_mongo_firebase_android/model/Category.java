package com.sabihamumcu.spring_mongo_firebase_android.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "urunler")
public class Category {

    @Id
    private String id;
    private String baslik;
    List<SubCategory> altUrun;
    private boolean isNotified;

    public Category(List<SubCategory> altUrun) {
        this.altUrun = altUrun;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SubCategory> getAltUrun() {
        return altUrun;
    }

    public void setAltUrun(List<SubCategory> altUrun) {
        this.altUrun = altUrun;
    }

    public boolean isNotified() {
        return isNotified;
    }

    public void setNotified(boolean notified) {
        isNotified = notified;
    }
}
