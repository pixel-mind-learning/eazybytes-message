package com.eazybytes.message.function;

import com.eazybytes.message.dto.AccountMsgDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Slf4j
@Configuration
public class MessageFunction {

    @Bean
    public Function<AccountMsgDTO, AccountMsgDTO> email() {
        return accountMsgDTO -> {
            log.info("Email sent to: {}", accountMsgDTO.toString());
            return accountMsgDTO;
        };
    }

    @Bean
    public Function<AccountMsgDTO, Long> sms() {
        return accountMsgDTO -> {
            log.info("Sms sent to: {}", accountMsgDTO.toString());
            return accountMsgDTO.accountNumber();
        };
    }
}
