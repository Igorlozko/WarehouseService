package ie.atu.warehouseservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails {

        @JsonProperty("warehouseId")
        private int warehouseId;
        @JsonProperty ("location")
        private int location;
        @JsonProperty ("capacity")
        private int capacity;
}
