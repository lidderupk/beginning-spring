import account.AccountService;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ulidder on 6/20/16.
 */
public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);


        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        System.out.println("Before money transfer");
        System.out.println("Account 1 balance: "  + accountService.getAccount(1).getBalance());
        System.out.println("Account 1 balance: "  + accountService.getAccount(2).getBalance());


        accountService.transferMoney(1, 2, 5.0);
        System.out.println("After money transfer");
        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
    }
}
