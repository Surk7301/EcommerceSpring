package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.CategoryDTO;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component

public class FakeStoreRestTemplateGateway implements ICategoryGateway{

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return List.of();
    }
}
