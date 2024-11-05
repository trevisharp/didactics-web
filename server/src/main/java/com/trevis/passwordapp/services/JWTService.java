package com.trevis.passwordapp.services;

import java.util.Map;

public interface JWTService {
    String get(Map<String, Object> customClaims, Long user);
    Map<String, Object> validate(String jwt);
}