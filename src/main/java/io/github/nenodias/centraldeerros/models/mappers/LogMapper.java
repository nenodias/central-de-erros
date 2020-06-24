package io.github.nenodias.centraldeerros.models.mappers;

import io.github.nenodias.centraldeerros.models.Log;
import io.github.nenodias.centraldeerros.models.dtos.LogDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LogMapper {
    
    LogMapper INSTANCE = Mappers.getMapper(LogMapper.class);

    LogDto entityToDto(Log log);

    Log dtoToEntity(LogDto dto);

}
