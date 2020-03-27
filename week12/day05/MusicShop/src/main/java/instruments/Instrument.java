package instruments;

public abstract class Instrument {

    private String type;
    private String material;
    private String section;

    public Instrument(String type, String material, String section) {
        this.type = type;
        this.material = material;
        this.section = section;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getSection() {
        return section;
    }
}
