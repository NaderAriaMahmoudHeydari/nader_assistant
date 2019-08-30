package com.nader.aria.nader_assistant.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Session {

    private static final long serialVersionUID = 1L;

    private  static Map<String,Object> params;

    private static Session instance;

    public synchronized static Session getInstance(){

        int count = 0;
        int two = 0;
        if( instance == null ){
            instance = new Session();
            System.out.println("instance is null = "+count);
            count++;


        }else if( instance != null ){
            System.out.println("instance is not null = "+two);

            two++;
        }

        return instance;

    }

    private Session(){

        params = new HashMap<>();

    }

    public final void add(String key,Object value){

        params.put(key,value);

    }

    public final Optional<Object> get(String key){
        return Optional.of(params.get(key));
    }

    public final void replace(String key, Object value){

        if( params.containsKey( key ) ){
            params.replace(key,value);
        }else {
            params.put(key,value);
        }
    }

    public final void clear(){
        params.clear();
    }

    public final boolean containsKey(String key) {
        return params.containsKey(key);
    }


}
