### Решение

#### **Часть (а): Доменное тестирование**

##### Анализ условий задачи:
1. Для треугольника должны выполняться **неравенства треугольника**:
    - \( a + b > c \),
    - \( a + c > b \),
    - \( b + c > a \).
2. Вид треугольника:
    - **Равносторонний**: \( a = b = c \).
    - **Равнобедренный**: \( a = b \neq c \), \( a = c \neq b \), \( b = c \neq a \).
    - **Разносторонний**: \( a \neq b \neq c \neq a \).

##### Тестовые данные:
Сформируем таблицу с учётом граничных значений.

| Test Case ID | \(a\) | \(b\) | \(c\) | Является треугольником? | Тип треугольника        | Обоснование                            |
|--------------|-------|-------|-------|-------------------------|-------------------------|----------------------------------------|
| 1            | 0     | 0     | 0     | Нет                     | -                       | Все стороны равны нулю                |
| 2            | 1     | 1     | 1     | Да                      | Равносторонний          | Все стороны равны                     |
| 3            | 2     | 2     | 3     | Да                      | Равнобедренный          | \(a + b > c, a = b \neq c\)           |
| 4            | 3     | 4     | 5     | Да                      | Разносторонний          | Выполнены неравенства треугольника    |
| 5            | 1     | 2     | 3     | Нет                     | -                       | \(a + b = c\), неравенство нарушено   |
| 6            | 10    | 10    | 10    | Да                      | Равносторонний          | Все стороны равны                     |
| 7            | 0     | 5     | 5     | Нет                     | -                       | Одна из сторон равна нулю             |
| 8            | 6     | 6     | 10    | Да                      | Равнобедренный          | \(a + b > c, a = b \neq c\)           |
| 9            | 7     | 8     | 9     | Да                      | Разносторонний          | Выполнены неравенства треугольника    |
| 10           | 1000  | 1     | 1     | Нет                     | -                       | \(a + b < c\), неравенство нарушено   |

---

#### **Часть (б): Код на Java**

Данная задача решена в классе `TriangleСhecker`

Тесты находятся в классе `TriangleСheckerTest` и используют библиотеку JUnit 5.