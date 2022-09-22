package com.bernabaykan.citizenmanagementsystem.Constants;

public class Apis {

    /**
     * UYGULAMA ÇATISI
     */
    public static final String VERSION = "/v1";
    /**
     * http://localhost:9090/v1/WEB
     * http://localhost:9090/v1/API
     */
    public static final String WEB = "/WEB";
    public static final String API = "/API";
    /**
     * http://localhost:9090/mk01/WEB/citizen
     * http://localhost:9090/mk01/API/citizen
     *
     * API -> citizen
     * API -> children
     *
     */
    public static final String CITIZEN = "/citizen";
    public static final String CHILDREN = "/children";

    /**
     * Actions -> Methodlar
     * DEFAULT SORGULAR
     */
    public static final String SAVE = "/save";
    public static final String UPDATE = "/update";
    public static final String DELETE = "/delete";
    public static final String FIND_ALL = "/findAll";
    public static final String FIND_BY_ID = "/findById";
    public static final String FIND_BY_NAME = "/findByName";
}
