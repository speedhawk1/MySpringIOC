package e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/3.
 */
@Component
public class Business {

    @Autowired
    @Qualifier(value = "u")
    private DeviceWriter deviceWriter;
//    public Business(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }


    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void savedata(){
       deviceWriter.saveToDevice();
    }


}
