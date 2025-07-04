package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import com.ecom.EcommerceSpring.gateway.api.FakeStoreCategoryAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component()
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryAPI fakeStoreCategoryAPI;

    public FakeStoreCategoryGateway(FakeStoreCategoryAPI fakeStoreCategoryAPI){
        this.fakeStoreCategoryAPI = fakeStoreCategoryAPI;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException  {

//        1. Make the HTTP request to the FakeStore API to fetch all categories
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryAPI.getAllFakeCategories().execute().body();

//        2. Check if the response is null and throw and IOException if it is
        if(response == null){
            throw new IOException("Failed to fetch categories from Fakestore API");
        }

//        3. Map the response to a list of CategoryDTO objects
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                .name(category).build())
                .toList();


    }



}
