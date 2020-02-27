package ru.orangebagerr.callboard.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
