package e;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/3.
 */
@Component("f")
public class FloppyWriter implements DeviceWriter {
    @Override
    public void saveToDevice() {
        System.out.println("floppy");
    }
}
