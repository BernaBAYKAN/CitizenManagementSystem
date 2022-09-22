package com.bernabaykan.citizenmanagementsystem.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {
    NOT_FOUND(1000,"bulunamadı.",INTERNAL_SERVER_ERROR),
    DONT_SAVE(1001,"kaydedilemedi",INTERNAL_SERVER_ERROR);


    private int code;
    private String message;
    HttpStatus httpStatus;
}
