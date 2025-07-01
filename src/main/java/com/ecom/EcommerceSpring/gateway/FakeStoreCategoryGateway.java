package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import com.ecom.EcommerceSpring.gateway.api.FakeStoreCategoryAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryAPI fakeStoreCategoryAPI;

    public FakeStoreCategoryGateway(FakeStoreCategoryAPI fakeStoreCategoryAPI){
        this.fakeStoreCategoryAPI = fakeStoreCategoryAPI;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException  {
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryAPI.getAllFakeCategories().execute().body();
        if(response == null){
            throw new IOException("Failed to fetch categories from Fakestore API");
        }
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                .name(category).build())
                .toList();


    }
}
