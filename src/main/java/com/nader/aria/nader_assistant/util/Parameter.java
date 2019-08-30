package com.nader.aria.nader_assistant.util;

import java.util.HashMap;
import java.util.Map;

public class Parameter {

    private String key;

    private Object value;

    private Map<String,Object> params;

    public Parameter(){}

    public Parameter(String key,Object value){
        setKey(key);
        setValue(value);
    }

    public final String getKey(){ return key; }
    public final void setKey(String key){ this.key = key; }

    public final Object getValue(){ return value; }
    public final void setValue(Object value){ this.value = value; }

    public final Parameter add(String key, Object value){

        if( params == null ){
            params = new HashMap<>();
        }

        params.put(key,value);

        return this;
    }

    public final Map<String,Object> getParams(){

        return params;
    }

}
