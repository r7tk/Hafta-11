package dev.patika.spring.api;

import dev.patika.spring.business.abstracts.ICostumerServices;
import dev.patika.spring.dto.CustomerDto;
import dev.patika.spring.dto.CustomerDtoConverter;
import dev.patika.spring.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    private ICostumerServices costumerServices;
    @Autowired
    private CustomerDtoConverter converter;
    @Autowired
    private ModelMapper modelMapper;

    // DATA TRANSFER OBJECT

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findAll(){
       /* List<Customer> customersList = this.costumerServices.findAll();
        List<CustomerDto> customerDtoList = customersList.stream().map(
                customer -> this.converter.convertDto(customer)
        ).collect(Collectors.toList());*/
        List<CustomerDto> customerDtoList = this.costumerServices.findAll().stream().toList().stream().map(
                customer -> this.modelMapper.map(customer,CustomerDto.class)
        ).collect(Collectors.toList());

        return this.costumerServices.findAll();
    }


    @GetMapping("/customer")
    @ResponseStatus(HttpStatus.CREATED)
    public  Customer save(@RequestBody Customer customer){
        return this.costumerServices.save(customer);
    }

    @PutMapping("/customer")
    @ResponseStatus(HttpStatus.OK)
    public Customer update(@RequestBody Customer customer){
        return this.costumerServices.update(customer);
    }
    @DeleteMapping("customer/{id}")
    public void delete(@PathVariable("id")int id){
        this.costumerServices.delete(id);
    }
    @GetMapping("/customer/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getByID(@PathVariable("id")int id){
        Customer customer = this.costumerServices.getByID(id);
        CustomerDto customerDto = this.converter.convertDto(customer);
        return customerDto;
    }

}
