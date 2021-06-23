package com.gamez.teiid;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "material")
//@SelectQuery("SELECT id, name, type FROM db.material") //THROWING EXCEPTION DUE TO NO JDBC CONNECTION
public class Material {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "type")
    String type;

    @Column(name = "descrip")
    String descrip;

    @Column(name = "code")
    String code;

    @Column(name = "status")
    String status;

}
