package bank;

import java.math.BigDecimal;
import java.util.List;

public class Account {
    private String accountId;
    private BigDecimal accountBalance = new BigDecimal("0.00");
    private List<Client> clients;

    public Account(String clientId, List<Client> clients) {
        this.accountId = clientId;
        this.clients = List.copyOf(clients);
    }

    public void moneyDeposit(BigDecimal amount) {
        this.accountBalance.add(amount);
    }

    public void moneyWithdraw(BigDecimal amount) {
        this.accountBalance.subtract(amount);
    }
}
