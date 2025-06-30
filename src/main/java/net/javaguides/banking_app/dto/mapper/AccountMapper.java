package net.javaguides.banking_app.dto.mapper;

import lombok.Getter;
import lombok.Setter;
import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;

@Getter
@Setter
public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        Account account;
        account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto;
        accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
