package com.ecom.EcommerceSpring.configuration;

import com.ecom.EcommerceSpring.gateway.api.FakeStoreCategoryAPI;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    public static String getBaseUrl(){
        Dotenv dotenv = Dotenv.configure().load();
        dotenv.entries().forEach(  entry -> System.setProperty(entry.getKey(), entry.getValue()));

        return dotenv.get("baseURL");

    }


    @Bean
    public Retrofit retrofit(){
       return new Retrofit.Builder()
               .baseUrl(getBaseUrl())
               .addConverterFactory(GsonConverterFactory.create())
               .build();
    }

    @Bean
    public FakeStoreCategoryAPI fakeStoreCategoryAPI(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryAPI.class);

    }
}
