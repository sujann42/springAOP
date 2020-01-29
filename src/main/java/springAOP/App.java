package springAOP;

import com.aopdemo.dao.AccountDAO;
import com.appdemo.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO= context.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount();

        context.close();
    }
}
