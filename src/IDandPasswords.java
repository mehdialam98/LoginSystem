import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("mehdialam98", "pudding");
        logininfo.put("clearme", "biometrics123");
        logininfo.put("giant", "CASHIER");
    }

    protected HashMap getLoginInfo() {
        return  logininfo;
    }
}
