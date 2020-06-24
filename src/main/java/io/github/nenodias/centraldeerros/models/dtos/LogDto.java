package io.github.nenodias.centraldeerros.models.dtos;

import io.github.nenodias.centraldeerros.models.enums.LevelEnum;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class LogDto implements Serializable {

    private Long id;

    @NotNull
    private LevelEnum level;

    @NotNull
    @NotBlank
    @Size(max = 255)
    private String description;

    @NotNull
    private String log;

    @NotNull
    @NotBlank
    @Size(max = 255)
    private String origin;

    @NotNull
    @NotBlank
    private Date date;

    @NotNull
    @NotBlank
    private Long quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
