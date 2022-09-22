package com.bernabaykan.citizenmanagementsystem.Exception;

import lombok.Getter;

@Getter
public class CitizenManagerException extends RuntimeException{
    private final ErrorType errorType;

    public CitizenManagerException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public CitizenManagerException(ErrorType errorType, String customMessage){
        super(customMessage);
        this.errorType = errorType;
    }

}
