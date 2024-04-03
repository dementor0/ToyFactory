package toyvehicles;

import utils.GenerateArticle;

public abstract class Car { // абстрактный класс представляющий машинки
    private static final String ARTICLE_NUMBER = GenerateArticle.generateArticleNumber(Car.class.getSimpleName());   // артикул

    protected void blinkLights() {
        System.out.println("Моргание фарами");
    }
    protected abstract void makeSound();

    public String getArticleNumber() { return ARTICLE_NUMBER; }

}
