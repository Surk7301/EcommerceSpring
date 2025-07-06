package com.ecom.EcommerceSpring.gateway.api;

import com.ecom.EcommerceSpring.dto.FakeStoreProductOfCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FakeStoreProductOfCategoryAPI {

    @GET("products/category")
   Call<FakeStoreProductOfCategoryResponseDTO> getFakeProduct(@Query("type") long type);

}
