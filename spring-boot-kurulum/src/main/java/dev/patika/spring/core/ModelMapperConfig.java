package dev.patika.spring.core;


import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper().getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper;
    }
}
