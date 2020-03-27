package instruments;

import enums.Section;

public abstract class Instrument {

    private String type;
    private String material;
    private Section section;

    public Instrument(String type, String material, Section section) {
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

    public Section getSection() {
        return section;
    }
}
