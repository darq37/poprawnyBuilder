package com.umcs;

public class Plik {
    private String header;
    private String tag;
    private String body;


    public Plik(String header, String tag, String body) {
        this.header = header;
        this.body = body;
        this.tag = tag;
    }
    public String toString(){
        return ("Header: " + header + ", Tag: " + tag + ", Body: " + body);
    }
}
