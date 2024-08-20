package com.fatec.e1_forms.utils;

public class CustomResponse {
    private int id;
    private String message;
    private Object data;

    public CustomResponse(int id, String message, Object data) {
        this.id = id;
        this.message = message;
        this.data = data;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}