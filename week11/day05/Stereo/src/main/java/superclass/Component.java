package superclass;

public abstract class Component {

    private String make;
    private String model;
    private String colour;

    public Component(String make, String model, String colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
