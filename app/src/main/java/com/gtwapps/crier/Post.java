package com.gtwapps.crier;

/**
 * Created by Ross on 14/08/2017.
 */

public class Post {

    private String link;
    private String text;
    private String commLink;
    private int hates;
    private int rates;
    private int comments;

    private int score;

    public Post(String link){
        this.link = link;
        setUpPost();
    }

    private void setUpPost(){

    }

    public String getLink() {
        return link;
    }

    public String getText(){
        return text;
    }

    public String getCommLink(){
        return commLink;
    }

    public int getHates(){
        return hates;
    }

    public int getRates(){
        return rates;
    }

    public int getComments(){
        return comments;
    }

    public int getScore(){
        return score;
    }
}
