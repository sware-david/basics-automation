package packages.sandbox;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Assert;

import com.automation.services.LogService;

public class LoginPractice {
    private Logger logger = LogService.getLogger();
    private final String numberStr = "0123456789";

    public void loginUser(String username) {
        logger.config("configuring user for login authentication -> userName: " + username);
        String password = generateKeyAccess(username.length());
        logger.fine("making the magic!");
        /* magic tricks to login */
        logger.finer("accessing with credentials: " + password);
        Random rand = new Random();
        boolean logged = (rand.nextInt(10) + 1) % 2 == 0;
        if (logged) {
            logger.info("loggin success!");
        } else {
            logger.warning("Incorrect login. Please check your credentials.");
        }
        Assert.assertTrue("Error login user!!!", logged);
    }

    private String generateKeyAccess(int length) {
        logger.finest("generating key access, length -> " + length);
        String keyAccess = "";
        Random random = new Random();
        for (int i = 0; i < length;i++) {
            int index = random.nextInt(numberStr.length());
            keyAccess += numberStr.charAt(index);
        }
        logger.finer("key access generated success: " + keyAccess);
        return keyAccess;
    }
}
