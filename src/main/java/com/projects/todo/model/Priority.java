package com.projects.todo.model;

/**
 * Created by sstoica on 5/14/2018.
 */
public enum Priority {
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private final String displayName;

    Priority(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
