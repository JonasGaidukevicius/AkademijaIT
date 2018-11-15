package lt.vtvpmc.ems.akademijait.jonas.sheep;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;

public class MySheep extends Sheep {
    private String sheepName;

    public MySheep(SheepColor color, String name) {
        super(color);
        this.sheepName = name;
    }

    public String getName() {
        return sheepName;
    }
}
