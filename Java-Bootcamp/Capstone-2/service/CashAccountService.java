package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    public CashAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public void createTradeAccount(CashAccount tradeAccount) {
        this.repository.createTradeAccount(tradeAccount);
    }

    public CashAccount retrieveTradeAccount(String id) {
        return (CashAccount) this.repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(CashAccount tradeAccount) {
        this.repository.updateTradeAccount(tradeAccount);
    }

    public void deleteTradeAccount(String id) {
        this.repository.deleteTradeAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount cashAccount = (CashAccount) retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().add(amount));
        updateTradeAccount(cashAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount cashAccount = (CashAccount) retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().subtract(amount));
        updateTradeAccount(cashAccount);
    }
}