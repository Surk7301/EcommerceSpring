package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.FakeStoreProductsResponseDTO;
import com.ecom.EcommerceSpring.dto.ProductDTO;
import com.ecom.EcommerceSpring.gateway.api.FakeStoreProductAPI;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import retrofit2.Call;


@Component
public class FakeStoreProductGateway implements IProductGateway{

    private final FakeStoreProductAPI fakeStoreProductAPI;

    FakeStoreProductGateway (FakeStoreProductAPI fakeStoreProductAPI){
        this.fakeStoreProductAPI = fakeStoreProductAPI;
    }

    public ProductDTO getProductById(Long id) throws Exception {
        FakeStoreProductsResponseDTO response = this.fakeStoreProductAPI.getFakeProduct(id).execute().body();

        if (response == null) {
            throw new Exception("Product not found");
        }
        return  response.getProduct();



    }


}
