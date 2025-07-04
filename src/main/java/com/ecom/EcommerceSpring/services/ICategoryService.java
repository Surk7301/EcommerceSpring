package com.ecom.EcommerceSpring.services;

import com.ecom.EcommerceSpring.dto.CategoryDTO;
import com.ecom.EcommerceSpring.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface ICategoryService {

    List<CategoryDTO> getAllCategories() throws IOException;


}
