package account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ulidder on 6/20/16.
 */
public class AccountDaoInMemoryImpl implements AccountDao {

    private Map<Long, Account> accountMap = new HashMap<Long, Account>();
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("John");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("Mary");
        account2.setBalance(20.0);

        accountMap.put(account1.getId(), account1);
        accountMap.put(account2.getId(), account2);
    }

    @Override
    public void insert(Account account) {
    accountMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void update(List<Account> accounts) {

    }

    @Override
    public void delete(long accountId) {

    }

    @Override
    public Account find(long accountId) {
        return accountMap.get(accountId);
    }

    @Override
    public List<Account> find(List<Long> accountIds) {
        return null;
    }

    @Override
    public List<Account> find(String ownerName) {
        return null;
    }

    @Override
    public List<Account> find(boolean locked) {
        return null;
    }
}
