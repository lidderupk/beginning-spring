package account;

/**
 * Created by ulidder on 6/20/16.
 */
public interface AccountService {

    public void transferMoney(
            long sourceAccountId, long targetAccountId, double amount
    );

    public void depositMoney(long accountId, double amount) throws Exception;

    public Account getAccount(long accountId);
}
