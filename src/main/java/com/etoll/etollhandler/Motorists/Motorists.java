package com.etoll.etollhandler.Motorists;

public class Motorists {
    private Long id;
    private String userid;
    private String vehiclename;
    private String numberplate;

    public Motorists() {

    }

    public Motorists(Long id,
                    String userid,
                    String vehiclename,
                    String numberplate) {
        this.id = id;
        this.userid = userid;
        this.vehiclename = vehiclename;
        this.numberplate = numberplate;
    }

    public Motorists(String userid,
                    String vehiclename,
                    String numberplate) {
        this.userid = userid;
        this.vehiclename = vehiclename;
        this.numberplate = numberplate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    @Override
    public String toString() {
        return "motorist{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", vehiclename='" + vehiclename + '\'' +
                ", numberplate='" + numberplate + '\'' +
                '}';
    }
}
