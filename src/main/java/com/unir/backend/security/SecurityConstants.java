package com.unir.backend.security;

public class SecurityConstants {

    //Tiempo de validación del JWT -> 5 min
    public static final long EXPIRATION_DATE = 300;
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    //Como va a generar el token
    public static final String TOKEN_SECRET = "0j0h92h1xcq0iARd746Ks2uOmqDIHERE";

}
