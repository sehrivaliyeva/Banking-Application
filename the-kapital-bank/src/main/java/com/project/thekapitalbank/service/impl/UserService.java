package com.project.thekapitalbank.service.impl;

import com.project.thekapitalbank.dto.BankResponse;
import com.project.thekapitalbank.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);



}
