package com.ecs.my_ecommerce_app.dto.response;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseWrapper <T>{

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("message")
    private String message;

    @JsonProperty("code")
    private Integer code;

    @JsonProperty("data")
    private T data;

    @JsonProperty("timestamp")
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime timestamp;

    @JsonProperty("path")
    private String path;

    //Success constructors
    public ResponseWrapper(String message, T data, HttpStatus httpStatus) {
        this.success = true;
        this.message = message;
        this.code = httpStatus.value();
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public ResponseWrapper(String message, HttpStatus httpStatus) {
        this.success = true;
        this.message = message;
        this.code = httpStatus.value();
        this.timestamp = LocalDateTime.now();
    }

    //Error constructor
    public ResponseWrapper(String message, HttpStatus httpStatus, boolean success){
        this.success = success;
        this.message = message;
        this.code = httpStatus.value();
        this.timestamp = LocalDateTime.now();
    }


    // Static factory methods for common responses
    public static <T> ResponseWrapper<T> success(String message, T data){
        return new ResponseWrapper<>(message, data, HttpStatus.OK);
    }

    public static <T> ResponseWrapper<T> success(String message){
        return new ResponseWrapper<>(message, HttpStatus.OK);
    }

    public static <T> ResponseWrapper<T> created(String message, T data){
        return new ResponseWrapper<>(message, data, HttpStatus.CREATED);
    }

    public static <T> ResponseWrapper<T> error(String message, HttpStatus status){
        return new ResponseWrapper<>(message, status, false);
    }


    //Method to set request path
    public ResponseWrapper<T> withPath(String path){
        this.path = path;
        return this;
    }




}
