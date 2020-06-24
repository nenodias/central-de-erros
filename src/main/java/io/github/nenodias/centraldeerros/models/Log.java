package io.github.nenodias.centraldeerros.models;

import io.github.nenodias.centraldeerros.models.enums.LevelEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private LevelEnum level;

    @NotNull
    @NotBlank
    @Size(max = 255)
    @Column(length = 255)
    private String description;

    @Lob
    @Column()
    private String log;

    @NotNull
    @NotBlank
    @Size(max = 255)
    @Column(length = 255)
    private String origin;

    @NotNull
    @NotBlank
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @NotNull
    @NotBlank
    @Column
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
