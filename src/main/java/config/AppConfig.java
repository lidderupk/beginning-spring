package config;

import account.AccountDao;
import account.AccountDaoInMemoryImpl;
import account.AccountService;
import account.AccountServiceImpl;
import org.springframework.context.annotation.*;

/**
 * Created by ulidder on 6/20/16.
 */
@Configuration
public class AppConfig {
    @Bean
    public AccountService accountService() {
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountDao(accountDao());
        return bean;
    }

    @Bean
    public AccountDao accountDao() {
        AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
        return bean;
    }
}
