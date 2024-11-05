package com.trevis.backend.challenge.services;

import java.util.Map;

public interface JWTService<T> {
    String get(Map<String, Object> customClaims, Long user);
    Map<String, Object> validate(String jwt);
}