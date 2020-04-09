package superclass.subclasses;

import superclass.Component;

public class GraphicEQ extends Component {

    private String EQSettings;

    public GraphicEQ(String make, String model, String colour){
        super(make, model, colour);
        this.EQSettings = "Too Jazzy";
    }
}
