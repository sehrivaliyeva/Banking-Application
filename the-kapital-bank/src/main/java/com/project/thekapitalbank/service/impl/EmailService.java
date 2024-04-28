package com.project.thekapitalbank.service.impl;

import com.project.thekapitalbank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);

    void sendEmailWithAttachment(EmailDetails emailDetails);

}
