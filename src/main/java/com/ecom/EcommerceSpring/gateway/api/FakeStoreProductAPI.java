package com.ecom.EcommerceSpring.gateway.api;

import com.ecom.EcommerceSpring.dto.FakeStoreProductsResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakeStoreProductAPI {

    @GET("products/{id}")
    Call<FakeStoreProductsResponseDTO>getFakeProduct(@Path("id") Long id) throws IOException;
}
