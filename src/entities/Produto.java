package entities;

public class Produto {
    private String name;
    private Double price;

    private String lastname;
    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
