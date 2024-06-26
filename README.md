# Проект “Завод игрушек”

Этот проект представляет собой систему производства игрушек. Проект является многомодульным и содержит: отдел контроля качества (QA), отдел снабжения, отдел производства, которые совместно обеспечивают производство и проверку игрушек.

## Структура проекта

Проект разделен на следующие модули:
  - ToyFactory - основной модуль, содержащий родительский pom.xml с зависимостью lombok, а также другие модули.
  - qa - модуль для контроля качества. В нем находятся классы, отвечающие за проверку игрушек, а имменно вывод в консоль информации о игрушке и проверка её работоспособности.
  - supply - модуль снабжения. В нем находятся классы, выступающие компонентами комплектующих для игрушек, а также класс, исполняющий роль кладовщика, который производит замену компонентов комплектуюищих.
  - factory - модуль производства. В нем находятся классы, которые выполняют производство конкретного типа игрушек. Данный модуль производит компоненты для каждой игрушки (антенна, пульт управления), которые должны быть в комплекте определенного типа игрушек.

## Примененные механизмы Java Core

1. Модули и зависимости с помощью Maven;
2. Инкапсуляция (private, protected, public);
3. Отношения композиции и наследования;
4. Использование this и super;
5. Статические поля и методы;
6. Перегрузка (Overloading) и переопределение (Overriding);
7. Вложенные классы;
8. Casting и оператор instanceof;
9. Обработка исключений:
   - Использование блокаtry-catch-finally для обработки исключений;
   - Реализация механизма re-throw;
   - Реализация multi-catch.
10. Абстрактные классы и методы;
11. Использование интерфейсов с применением default методов.
