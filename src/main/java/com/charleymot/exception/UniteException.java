package com.charleymot.exception;

public class UniteException extends Exception {
    private int code;
    private Object data;

    public UniteException() {
        super();
    }

    public UniteException(String message) {
        super(message);
    }

    public UniteException(int code, String message) {
        super(message);
        this.code = code;
    }
    public UniteException(int code, String message,Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public UniteException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniteException(Throwable cause) {
        super(cause);
    }

    protected UniteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
