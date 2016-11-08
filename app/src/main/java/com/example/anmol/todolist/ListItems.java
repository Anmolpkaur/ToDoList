package com.example.anmol.todolist;

/**
 * Created by Anmol on 11/4/2016.
 */
public class ListItems {

    private String wtitle;
    private String desc;

    public void setTitle(String t)
    {
        this.wtitle=t;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle()
    {
       return(this.wtitle);
    }

    public String getDesc() {
        return this.desc;
    }
}
