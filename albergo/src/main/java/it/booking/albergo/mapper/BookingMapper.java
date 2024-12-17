

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import it.booking.albergo.entity.BookingEntity;
import it.booking.model.BookingDTO;

@Mapper  (componentModel = "spring")
public interface BookingMapper {

    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    BookingDTO toDTO(BookingEntity booking);
    @Mapping(target = "id", ignore = true)
    BookingEntity toEntity(BookingDTO bookingDTO);
}

