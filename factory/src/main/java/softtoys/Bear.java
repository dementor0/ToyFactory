package softtoys;


import utils.Filler;

public class Bear extends SoftToys {       // класс представляющий медведя
    private static final Filler.ToyFillerType FILLER_TYPE = Filler.ToyFillerType.SINTEPON;

    public Bear() {
        super(FILLER_TYPE);
    }


    public void makeSound() {
        SoundMaker.makeBearSound();
    }
}
