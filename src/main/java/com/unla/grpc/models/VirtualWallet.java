package com.unla.grpc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "VirtualWallet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VirtualWallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String number;

    private long balance;

    private String name;

    private String surname;

    private int dni;

    private String validFrom;

    private String validUntil;

}
