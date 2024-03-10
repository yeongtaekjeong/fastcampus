package com.fastcampus.de.java.clip12;

public class IllegalPathAccessError extends Error{

    private String path;

    public IllegalPathAccessError(String path) {
        super();
        this.path = path;
    }

    public String getMessage() {
        return path + "is not allowed to access." + super.getMessage();
    }
}
