package com.unir.backend.security;

import com.unir.backend.SpringAplicationContext;

public class SecurityConstants {

    //Tiempo de validación del JWT -> 5 min
    public static final long EXPIRATION_DATE = 300000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    //Como va a generar el token

    public static String getTokenSecret(){
        AppProperties appProperties = (AppProperties) SpringAplicationContext.getBean("AppProperties");
        return appProperties.getToken();
    }

}
