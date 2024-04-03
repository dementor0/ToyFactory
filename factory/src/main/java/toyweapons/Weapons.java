package toyweapons;

import utils.GenerateArticle;

public abstract class Weapons {          // абстрактный класс представляющий игрушечное оружие

    private static final String ARTICLE_NUMBER = GenerateArticle.generateArticleNumber(Weapons.class.getSimpleName());   // артикул

    protected abstract void makeSound();     // метод издаваемого звука
    protected abstract void blinkLight();   // метод моргания светом
    protected abstract void shooting();     // метод стрельбы

    public String getArticleNumber() { return ARTICLE_NUMBER; }
}
