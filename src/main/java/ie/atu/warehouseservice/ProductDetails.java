package ie.atu.warehouseservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails {

        @JsonProperty("productId")
        private int productId;
        @JsonProperty ("productName")
        private String productName;
        @JsonProperty ("quantity")
        private int quantity;
        @JsonProperty ("warehouseId")
        private int warehouseId;
}
