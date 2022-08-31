package co.com.dalmope.model.type;

import java.util.Objects;

public class Type {

    private Long id;
    private String firstType;
    private String secondType;

    public Type(){}

    public Type(Long id, String firstType, String secondType){
        this.id = id;
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", firstType='" + firstType + '\'' +
                ", secondType='" + secondType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(firstType, type.firstType) && Objects.equals(secondType, type.secondType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstType, secondType);
    }
}
