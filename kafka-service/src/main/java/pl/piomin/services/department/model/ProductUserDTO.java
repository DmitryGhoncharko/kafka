package pl.piomin.services.department.model;

public class ProductUserDTO {

    private String email;


    private Long id;
    private String type;
    private String subtype;
    private String name;
    private Integer code;
    private String carType;
    private String carModel;
    private String carModification;
    private String creator;
    private Integer numInWarehouse;
    private Float cost;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModification() {
        return carModification;
    }

    public void setCarModification(String carModification) {
        this.carModification = carModification;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getNumInWarehouse() {
        return numInWarehouse;
    }

    public void setNumInWarehouse(Integer numInWarehouse) {
        this.numInWarehouse = numInWarehouse;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}

