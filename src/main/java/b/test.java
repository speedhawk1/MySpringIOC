package b;

import b.*;
import b.Business;

/**
 * Created by Administrator on 2016/12/3.
 */
public class test {
    public static void main(String[] args) {
        Business business = new Business(new USBWriter());

        business.saveData();
    }
}
