package com.nader.aria.nader_assistant.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATION_INFO")
public class ApplicationInfo extends BaseEntity {

    public ApplicationInfo(){}

    public ApplicationInfo(String key ,String value){
        this.setKey(key);
        this.setValue(value);
    }

    @Column(name = "KEYS")
    private String key;

    @Column(name = "VALUES")
    private String value;

    public String getKey(){ return key; }
    public void setKey(String key){ this.key = key; }

    public String getValue(){ return value; }
    public void setValue(String value){ this.value = value; }

}
