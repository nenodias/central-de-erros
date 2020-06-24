package io.github.nenodias.centraldeerros.controllers;

import io.github.nenodias.centraldeerros.models.Log;
import io.github.nenodias.centraldeerros.models.dtos.LogDto;
import io.github.nenodias.centraldeerros.models.mappers.LogMapper;
import io.github.nenodias.centraldeerros.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/logs")
public class LogController {

    @Autowired
    private LogRepository logRepository;

    @PostMapping
    public EntityResponse<LogDto> create(LogDto dto){
        final Log log = LogMapper.INSTANCE.dtoToEntity(dto);
        try {
            logRepository.saveAndFlush(log);
            return EntityResponse.fromObject(dto).status(HttpStatus.CREATED).build();
        }catch (Exception ex){
            return EntityResponse.fromObject(dto).status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }


}
