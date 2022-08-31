package co.com.dalmope.model.pokemon;

import java.util.Objects;

public class Pokemon {

    private Long id;
    private Long number;
    private String name;
    private Long typeId;

    public Pokemon(){}

    public Pokemon(Long id, Long number, String name, Long typeId) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.typeId = typeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", typeId=" + typeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id) && Objects.equals(number, pokemon.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }
}
