package com.project.thekapitalbank.service.impl;

import com.project.thekapitalbank.dto.BankResponse;
import com.project.thekapitalbank.dto.CreditDebitRequest;
import com.project.thekapitalbank.dto.EnquiryRequest;
import com.project.thekapitalbank.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);


}
