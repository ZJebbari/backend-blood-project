package com.zj.springbootproductseller.service;

import com.zj.springbootproductseller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
