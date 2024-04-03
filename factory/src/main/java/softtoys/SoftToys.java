package softtoys;

import lombok.Getter;
import utils.Filler;
import utils.GenerateArticle;

@Getter
public abstract class SoftToys {        // абстрактный класс представляющий плюшевые игрушки
    private static final String ARTICLE_NUMBER = GenerateArticle.generateArticleNumber(SoftToys.class.getSimpleName()); // артикул
    private final Filler.ToyFillerType fillerType;                      // наполнитель

    public SoftToys(Filler.ToyFillerType fillerType) {
        this.fillerType = fillerType;
    }

    public String getArticleNumber() { return ARTICLE_NUMBER; }

    public static class SoundMaker {
        public static void makeCowSound() {
            System.out.println("Му-у-у-у");
        }

        public static void makeBearSound() {
            System.out.println("Р-р-р-р");
        }
    }
}
