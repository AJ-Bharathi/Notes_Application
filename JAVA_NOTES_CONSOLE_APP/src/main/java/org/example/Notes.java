package org.example;

public class Notes {
    private String title,content;
    private int userId;
    public Notes( String title, String content, int userId)
    {
        this.title=title;
        this.content=content;
        this.userId=userId;
    }
    public String getTitle()
    {
        return title;
    }
    public String getContent()
    {
        return content;
    }
    public int getUserId(){
        return userId;
    }
    public void setContent(String content){
        this.content=content;
    }
}
