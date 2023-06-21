package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public void createTradeAccount(MarginAccount tradeAccount) {
        this.repository.createTradeAccount(tradeAccount);
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) this.repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount tradeAccount) {
        this.repository.updateTradeAccount(tradeAccount);
    }

    public void deleteTradeAccount(String id) {
        this.repository.deleteTradeAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().add(amount));
        updateTradeAccount(marginAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().subtract(amount));
        updateTradeAccount(marginAccount);
    }
}