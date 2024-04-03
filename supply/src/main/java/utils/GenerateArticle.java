package utils;

import java.util.HashMap;
import java.util.Map;

public class GenerateArticle {
    private static final Map<String, Integer> ARTICLE_NUMBERS = new HashMap<>();

    public static String generateArticleNumber(String toyType) {                   // метод генерации артикула для игрушек
        int currentNumber = ARTICLE_NUMBERS.getOrDefault(toyType, 0);   // Получим текущий номер для данного типа
        currentNumber++;                                                           // Увеличиваем номер на 1 для игрушки данного типа
        ARTICLE_NUMBERS.put(toyType, currentNumber);                               // Сохраняем обновленный номер
        String numericPart = String.format("%04d", currentNumber);                 // Генерируем числовую часть артикула
        String alphabeticPart = toyType.substring(0, 2).toUpperCase();             // Генерируем буквенную часть артикула
        return alphabeticPart + numericPart;
    }

}
