package com.example.demojavafx.model;

public class Password {



    private String keyWord;
    private String content;

    public Password(){
        this.keyWord = "000000";
    }


    public Password(String kw) {
        this.keyWord = kw;
        this.content = "";
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String kw) {
        this.keyWord = kw;
    }

    public boolean verifyKW(String kw){
        return this.keyWord.equals(kw);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Password{" +
                "keyWord='" + keyWord + '\'' +

                '}';
    }

}
