package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String aPaterno;
    private String aMaterno;
    private String rfc;


    public Long getcId() {
        return id;
    }

    public void setcId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getcName() {
        return name;
    }

    public void setcName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    @ColumnName("apellido_materno")
    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    @ColumnName("RFC")
    public String getrfc() {
        return rfc;
    }

    public void setrfc(String rfc) {
        this.rfc = rfc;
    }


}