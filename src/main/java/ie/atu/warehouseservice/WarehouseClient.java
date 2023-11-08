package ie.atu.warehouseservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name ="Warehouse-Service", url = "http/localhost:8081")
public interface WarehouseClient {
    @GetMapping ("/product")
    String  postData(@RequestBody ProductDetails productdetails);
}
