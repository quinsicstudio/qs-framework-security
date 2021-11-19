package com.quinsicstudio.framework.response;


import lombok.Data;

@Data
public class Response {
    private String code;
    private String message;

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }
}