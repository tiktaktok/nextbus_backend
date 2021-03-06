package com.mathieuclement.nextbus.backend.model.converter;

import javax.persistence.AttributeConverter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateConverter implements AttributeConverter<LocalDate, String> {
    @Override
    public String convertToDatabaseColumn(LocalDate attribute) {
        return new String(attribute.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    @Override
    public LocalDate convertToEntityAttribute(String dbData) {
        return LocalDate.parse(dbData, DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
