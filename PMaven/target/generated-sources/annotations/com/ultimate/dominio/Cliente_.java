package com.ultimate.dominio;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-03T20:32:21")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> codigo;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, Date> FechaNac;

}