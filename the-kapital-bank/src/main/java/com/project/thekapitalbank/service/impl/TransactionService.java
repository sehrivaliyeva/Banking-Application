package com.project.thekapitalbank.service.impl;

import com.project.thekapitalbank.dto.TransactionDto;
import com.project.thekapitalbank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);

}
