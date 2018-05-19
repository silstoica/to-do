package com.projects.todo.model;

/**
 * Created by sstoica on 5/14/2018.
 */
public enum Status {
    DONE("done"),
    IN_PROGRESS("in progress"),
    TO_DO("to do"),
    ON_HOLD("on hold");

    private final String displayName;

    Status(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
