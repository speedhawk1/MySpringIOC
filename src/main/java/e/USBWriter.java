package e;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/3.
 */
@Component("u")
public class USBWriter implements DeviceWriter {
//
//    public void saveToUsb(){
//        System.out.println("USB");
//    }

    @Override
    public void saveToDevice() {
        System.out.println("USB");
    }
}

