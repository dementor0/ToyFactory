package softtoys;

import utils.Filler;

public class Cow extends SoftToys {         // класс представляющий корову

    private static final Filler.ToyFillerType FILLER_TYPE = Filler.ToyFillerType.SINTEPUH;

    public Cow() {
        super(FILLER_TYPE);
    }


    public void makeSound() {
        SoundMaker.makeCowSound();
    }

}
