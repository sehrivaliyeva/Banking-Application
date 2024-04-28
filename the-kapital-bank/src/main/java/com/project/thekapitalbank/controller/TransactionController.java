package com.project.thekapitalbank.controller;

import com.itextpdf.text.DocumentException;
import com.project.thekapitalbank.entity.Transaction;
import com.project.thekapitalbank.service.impl.BankStatement;
import com.project.thekapitalbank.service.impl.TransactionService;
import io.swagger.v3.oas.models.links.Link;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/bankstatement")
@AllArgsConstructor
public class TransactionController {

    @Autowired
    BankStatement bankStatement;

    @GetMapping
    public List<Transaction> generateBankStatement(@RequestParam String accountNumber,
                                                   @RequestParam String startDate,
                                                   @RequestParam String endDate) throws DocumentException, FileNotFoundException {

        return bankStatement.generateStatement(accountNumber, startDate, endDate);
    }

}
