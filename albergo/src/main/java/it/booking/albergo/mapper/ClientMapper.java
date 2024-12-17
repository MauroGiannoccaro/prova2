package it.booking.albergo.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import it.booking.model.ClientDTO;
import it.booking.albergo.entity.ClientEntity;

@Mapper (componentModel = "spring")
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDTO clientDtotoEntity(ClientEntity clientEntity);
    @Mapping(target = "idPrenotazione", ignore = true)
    ClientEntity clientEntitytoDto (ClientDTO clientDto);
}