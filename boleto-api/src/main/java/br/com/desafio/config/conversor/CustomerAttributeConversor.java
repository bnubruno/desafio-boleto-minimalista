package br.com.desafio.config.conversor;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.com.desafio.entity.Customer;

@Converter(autoApply = true)
public class CustomerAttributeConversor implements AttributeConverter<Customer, String> {

	@Override
	public String convertToDatabaseColumn(Customer attribute) {
		return attribute.getName();
	}

	@Override
	public Customer convertToEntityAttribute(String dbData) {
		return new Customer(dbData);
	}

}
