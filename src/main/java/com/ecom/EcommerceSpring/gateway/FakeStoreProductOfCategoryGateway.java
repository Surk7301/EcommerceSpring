package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.FakeStoreProductOfCategoryResponseDTO;
import com.ecom.EcommerceSpring.dto.ProductOfCategoryDTO;
import com.ecom.EcommerceSpring.gateway.api.FakeStoreProductOfCategoryAPI;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class FakeStoreProductOfCategoryGateway implements IProductOfCategoryGateway{

    private final FakeStoreProductOfCategoryAPI fakeStoreProductOfCategoryAPI;

    public FakeStoreProductOfCategoryGateway (FakeStoreProductOfCategoryAPI fakeStoreProductOfCategoryAPI) {
        this.fakeStoreProductOfCategoryAPI = fakeStoreProductOfCategoryAPI;
    }

        public List<ProductOfCategoryDTO> getProductOfCategory(long type) throws Exception{
            FakeStoreProductOfCategoryResponseDTO response = this.fakeStoreProductOfCategoryAPI.getFakeProduct(type).execute().body();
            if(response==null){
                throw new Exception("Type not found");
            }
            return (List<ProductOfCategoryDTO>) response.getProductOfCategory().stream()
                    .map(category -> ProductOfCategoryDTO.builder()
                            .category(category.getCategory()) // assuming category has a 'getCategory' method
                            .image(category.getImage())
                            .color(category.getColor())
                            .price(category.getPrice())
                            .description(category.getDescription())
                            .onSale(category.getOnSale())
                            .discount(category.getDiscount())
                            .model(category.getModel())
                            .id(category.getId())
                            .title(category.getTitle())
                            .brand(category.getBrand())
                            .popular(category.getPopular())
                            .build())
                    .collect(Collectors.toList());



        }


}
