package com.devsuperior.dsmovie.config;

import com.devsuperior.dsmovie.domain.util.ObjectMapperUtils;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }

    @Bean
    public ObjectMapperUtils objectMapperUtils() {
        ObjectMapperUtils objectMapperUtils = new ObjectMapperUtils();
        return objectMapperUtils;
    }

}