package com.ecom.EcommerceSpring.gateway;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {


     List<CategoryDTO>getAllCategories() throws IOException;



}
