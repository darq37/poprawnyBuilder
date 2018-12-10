package com.umcs;

public class PlikBuilder {
    private String header;
    private String tag;
    private String body;

    public PlikBuilder setHeader(String header){
        this.header = header;
        return this;
    }
    public PlikBuilder setTag(String tag){
        this.tag = tag;
        return this;
    }
    public PlikBuilder setBody(String body){
        this.body = body;
        return this;
    }
    public Plik build(){
        return new Plik(header, tag, body);
    }

}
