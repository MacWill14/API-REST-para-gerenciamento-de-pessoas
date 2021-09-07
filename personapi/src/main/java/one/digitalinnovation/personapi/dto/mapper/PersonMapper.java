package one.digitalinnovation.personapi.dto.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * MapStruct é um gerador de código que simplifica a implementação de mapeamentos
 * entre os tipos de bean Java com base em uma convenção sobre abordagem de configuração.
 * Realiza o mapeamento entre as classes PersonEntity e PersonDTO.
 */
@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}