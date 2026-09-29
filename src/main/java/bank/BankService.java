package bank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BankService {
    private Map<String, Account> accounts = new HashMap<>();

    public String openAccount(List<Client> owners) {
        String accountId = UUID.randomUUID().toString();

        Account account = new Account(accountId, owners);
        accounts.put(accountId, account);

        return accountId;
    }

    public void transfer(String fromClientId, String toClientId, BigDecimal amount) {
        Account from = accounts.get(fromClientId);
        Account to = accounts.get(toClientId);

        from.moneyWithdraw(amount);
        to.moneyDeposit(amount);
    }
}
