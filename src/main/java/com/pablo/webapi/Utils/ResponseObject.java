package com.pablo.webapi.Utils;

public class ResponseObject {
    boolean success;
    String content;

    public ResponseObject(boolean _success,String _content){
        this.success = _success;
        this.content = _content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
