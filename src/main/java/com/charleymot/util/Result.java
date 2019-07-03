package com.charleymot.util;


import java.io.Serializable;
import java.util.Date;

/**
 * by hanjt
 */
public class Result implements Serializable {


    private static final long serialVersionUID = 7804834109497537863L;

    private int code;

    private String message;

    private Object data;

    private long timestamp;

    Result() {}

    Result(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
        this.timestamp = new Date().getTime();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * 成功返回
     */
    public static Result OK() {
        return new Result.Builder().setCode(Dict.OK).setMessage(Dict.OK_MESSAGE).builder();
    }

    /**
     * 成功返回,带有数据返回
     */
    public static Result OK(Object data) {
        return new Result.Builder().setCode(Dict.OK).setMessage(Dict.OK_MESSAGE).setData(data).builder();
    }

    /**
     * 新建或者更新数据成功
     */
    public static Result CREATED() {
        return new Result.Builder().setCode(Dict.CREATED).setMessage(Dict.CREATED_MESSAGE).builder();
    }

    /**
     * 新建或者更新数据成功，返回最新数据
     */
    public static Result CREATED(Object data) {
        return new Result.Builder().setCode(Dict.CREATED).setMessage(Dict.CREATED_MESSAGE).setData(data).builder();
    }

    /**
     * 请求已经进入队列
     */
    public static Result ACCEPTED() {
        return new Result.Builder().setCode(Dict.ACCEPTED).setMessage(Dict.ACCEPTED_MESSAGE).builder();
    }

    /**
     * 用户删除数据成功
     */
    public static Result NO_CONTENT() {
        return new Result.Builder().setCode(Dict.NO_CONTENT).setMessage(Dict.NO_CONTENT_MESSAGE).builder();
    }


    /**
     * 请求错误
     */
    public static Result INVALID_REQUEST() {
        return new Result.Builder().setCode(Dict.INVALID_REQUEST).setMessage(Dict.INVALID_REQUEST_MESSAGE).builder();
    }
    /**
     * 权限不足
     */
    public static Result UNAUTHORIZED() {
        return new Result.Builder().setCode(Dict.UNAUTHORIZED).setMessage(Dict.UNAUTHORIZED_MESSAGE).builder();
    }
    /**
     * 禁止访问
     */
    public static Result FORBIDDEN() {
        return new Result.Builder().setCode(Dict.FORBIDDEN).setMessage(Dict.FORBIDDEN_MESSAGE).builder();
    }

    /**
     * 资源未找到
     */
    public static Result NOT_FOUND() {
        return new Result.Builder().setCode(Dict.NOT_FOUND).setMessage(Dict.NOT_FOUND_MESSAGE).builder();
    }

    public static class Builder {
        int code;
        String message;
        Object data;
        long timestamp;

        public Builder setCode(int code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setData(Object data) {
            this.data = data;
            return this;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Result builder() {
            return new Result(this);
        }
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", timestamp=" + timestamp +
                '}';
    }
}
