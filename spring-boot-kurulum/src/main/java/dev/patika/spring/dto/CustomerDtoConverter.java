package dev.patika.spring.dto;

import dev.patika.spring.entities.Customer;
import org.springframework.stereotype.Component;


@Component
public class CustomerDtoConverter {
    public CustomerDto convertDto(Customer customer){
        /*CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customerDto.getId());
        customerDto.setMail(customerDto.getMail());
        customerDto.setName(customerDto.getName());

        return  customerDto;*/
    // Daha kısası altta yazı
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getMail()
        );
    }
}
