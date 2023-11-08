package ie.atu.warehouseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class WarehouseController {
    @PostMapping("/warehouse")
    public String getProduct(@RequestBody ProductDetails productDeatails){
        String confrimMessage  = String.format("Recieved details");
        return confrimMessage;
    }
    @GetMapping("/products")
    public String getWarehouseById()throws Exception, InterruptedException{
        List<CompletableFuture<ProductDetails>> future = new ArrayList<>();
        CompletableFuture.supplyAsync(()->productService.addData());
        futures.add(future);
    }
    CompletableFuture<Void>allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture([0]));
        allOf.get();
        return futures;
}
