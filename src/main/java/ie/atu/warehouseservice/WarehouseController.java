package ie.atu.warehouseservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
    @PostMapping("/warehouse")
    public String getProduct(@RequestBody ProductDetails productDeatails){
        String confrimMessage  = String.format("Recieved details");
        return confrimMessage;
    }
}
