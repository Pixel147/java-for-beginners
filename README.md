# java-for-beginners
## Встановлення IDE
<p>Я користуюсь IntelliJ IDEA і в подальшому тести будуть написані в ньому</p>
<p>IntelliJ IDEA https://metanit.com/java/tutorial/1.5.php</p>
<p>NetBeans https://metanit.com/java/tutorial/1.3.php</p>
<p>Eclipse https://metanit.com/java/tutorial/1.4.php</p>

<br/>

## Цей короткий курс по джаві поділяється на
1. Теорія з [Metanit.com](https://metanit.com/java/tutorial/)
2. Короткий опис
3. Декілька завдань(до деяких тем немає завдань :) )




<br/><br/><br/>




## Змінні та константи
### Теорія https://metanit.com/java/tutorial/2.11.php
### Короткий опис:
<p>В Java, змінні це місце, де можна зберігати дані. Вони мають ім'я і тип, так само як і константи. Різниця між ними в тому, що значення змінної може бути змінене в процесі виконання програми, в той час як константа має фіксоване значення і не може бути змінена під час виконання програми. Для оголошення константи в Java використовується слово final перед типом змінної.

```final int MAX_VALUE = 100;```

Змінні і константи створюються для того, щоб зберігати і передавати дані між різними частинами програми. Використання констант може допомогти захистити дані від несанкціонованого зміни і зберегти цілісність даних.</p>




<br/><br/><br/>




## Типи данних
### Теорія https://metanit.com/java/tutorial/2.12.php
### Короткий опис:
<p>Java підтримує багато типів даних, включаючи:
Цілі типи даних: byte, short, int, long
Типи даних з плаваючою комою: float, double
Логічний тип: boolean
Символьний тип: char
Java також підтримує слабку типізацію, тобто можливість використання змінної без вказування типу даних. Також, є система автоматичного перетворення типів (наприклад, можна завершити ціле число до типу double).
Типи данних в Java також можуть бути складні відносно простих типів, такі як Array, Strings, Enums, Classes.</p>




<br/><br/><br/>




## Консольный ввод/вывод в Java
### Теорія https://metanit.com/java/tutorial/2.9.php
### Короткий опис
<p>Java має декілька класів та методів для консольного введення та виведення даних. Найпоширеніші з них є:

System.in - стандартний потік введення, який може бути використаний для отримання даних з консолі.
System.out - стандартний потік виведення, який може бути використаний для виведення даних на консоль.
Наприклад
```
System.out.print("Enter your name: ");
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
```
В цьому прикладі коду спочатку виводиться повідомлення "Enter your name: ", затем користувач вводить своє ім'я і зберігається в змінну name, потім виводиться "Hello, (введене ім'я)!"
Крім того, Java також має клас Scanner, який може бути використаний для обробки тексту з консолі. Можна використовувати його методи для отримання різних типів даних, таких як nextInt(), nextDouble(), nextLine().</p>




<br/><br/><br/>




## Арифметические операции
### Теорія https://metanit.com/java/tutorial/2.3.php
### Короткий опис:
<p>
Java підтримує стандартні арифметичні операції, такі як:

Додавання: +
Віднімання: -
Множення: *
Ділення: /
Залишок від ділення: %
Наприклад:

```
int x = 5;
int y = 3;
int sum = x + y; // sum = 8
int diff = x - y; // diff = 2
int product = x * y; // product = 15
int quotient = x / y; // quotient = 1
int remainder = x % y; // remainder = 2
```
Java також підтримує операції з присвоєння, такі як +=, -=, *=, /=, %=. Це дозволяє записувати операції коротше. Наприклад:

```
x += y; // equivalent to x = x + y;
x *= y; // equivalent to x = x * y;
```
Java також має клас Math з багатьма методами для виконання більш складних математичних операцій, таких як округлення, обчислення тригонометричних функцій і т.д.
</p>



<br/><br/><br/>



## Условные выражения
### Теорія https://metanit.com/java/tutorial/2.14.php
### Короткий опис:
<p>
Операції порівняння в Java дозволяють порівнювати два значення і повертають булеве значення (true або false). 
Вони можуть бути використані для створення умовного оператора або циклу. 
Наприклад:

```
int a = 5;
int b = 7;

System.out.println(a == b);   // false
System.out.println(a != b);   // true
System.out.println(a > b);    // false
System.out.println(a < b);    // true
System.out.println(a >= b);   // false
System.out.println(a <= b);   // true
```
Логічні операції в Java дозволяють комбінувати булеві вирази і повертають також булеве значення. 
Вони можуть бути використані для створення складного умовного оператора. Наприклад:
```
boolean x = true;
boolean y = false;

System.out.println(x && y);  // false
System.out.println(x || y);  // true
System.out.println(!x);     // false
```
`&&` - оператор "та", повертає true якщо обидва вирази є true.<br/>
`||` - оператор "або", повертає true якщо хоча б один з виразів є true.<br/>
`!` - оператор "не", змінює булеве значення на протилежне.<br/>
Ці оператори можуть бути використані разом із умовними операторами такими як if та while, щоб створювати складні умови.
</p>



<br/><br/><br/>



## Конструкция if/else/else if
### Теорія https://metanit.com/java/tutorial/2.3.php
### Короткий опис:
<p>
`if` - це умовний оператор, який дозволяє виконувати блок коду лише якщо вираз в його умові є true. 
<br/>Наприклад:

```
int number = 5;
if (number > 0) {
   System.out.println("number є додатнім");
}
//output : number є додатнім
```

`else` - це оператор, який дозволяє виконувати інший блок коду, якщо умова в if операторі є false. <br/>Наприклад:

```
int number = -5;
if (number > 0) {
   System.out.println("number є додатнім");
} else {
   System.out.println("number є від'ємним або нулем");
}
//output : number є від'ємним або нулем
```

`else if` - це додатковий оператор, який може бути використаний з if для перевірки додаткових умов. Наприклад:

```
int number = 0;
if (number > 0) {
   System.out.println("number є додатнім");
} else if (number < 0) {
   System.out.println("number є від'ємним");
} else {
   System.out.println("number є нулем");
}
```

Як видно з прикладу, умова `if` перевіряє чи number більше нуля, якщо ця умова не виконується, то переходиться до `else if`, яка перевіряє чи number менше нуля. Якщо ні одна із цих умов не виконується, то виконується код у `else`.
Важливо зауважити, що програма буде виконувати тільки перший блок коду який співпадає з умовою, тому `рекомендується об''являти умови від найбільш специфічної до найбільш загальної.
</p>
   
### ЗАДАННЯ ДО if/else/else if
<p>
Напишіть програму, яка зчитує вік користувача та виводить "Ви молоді" якщо вік менше 18 років, "Ви дорослі" якщо вік більше 18 років, та "Ви маєте 18 років" якщо вік дорівнює 18 років.
</p>
<p>
Напишіть програму, яка зчитує число та виводить "Число парне", якщо ж число непарне вивести "Число непарне"
</p>




<br/><br/><br/>



## Конструкція switch case
### Теорія https://metanit.com/java/tutorial/2.5.php
### Короткий опис:
<p>
<code>switch-case</code> є конструкцією у мові програмування Java, яка використовується для вибору багатьох варіантів виконання коду на основі значення одного змінної. Ключове слово <code>switch</code> використовується для вказівки змінної, над якою буде проводитися перевірка, і ключове слово case використовується для вказівки кожного можливого значення цієї змінної. Код, який буде виконуватися, коли значення змінної збігається з одним з вказаних значень, повинен бути написаний під соответним <code>case</code> . Ключове слово break використовується для зупинки виконання коду в секції <code>switch</code> після того, як код в відповідному case був виконаний.
</p>

### Завдання:

<p>
Напишіть код, який буде виводити текстове повідомлення "Вітаю" для кожного дня тижня. День тижня має бути заданий як ціле число (0 = неділя, 1 = понеділок і т.д.).<br/>
Напишіть код, який буде переводити ціле число в одиниці вимірювання (0-5) в текстове повідомлення. (0 = "нуль", 1 = "один" і т.д.)
</p>



<br/><br/><br/>



## Циклы
### Теорія https://metanit.com/java/tutorial/2.6.php
### Короткий опис:
<p>
Цикли у Java - це конструкції, які дозволяють виконувати однаковий код декілька разів.

for цикл має структуру

```
for (налаштування початкових значень; умова виконання циклу; крок) {
   тіло циклу;
}
```

while цикл має структуру

```
while (умова) {
   тіло циклу;
}
```

do-while цикл має структуру

```
do {
   тіло циклу;
} while (умова);
```

Цикл <code>for</code> і <code>while</code> виконують тіло циклу, якщо умова виконання циклу є true, а цикл do-while виконує тіло циклу принаймні один раз перед перевіркою умови виконання.
</p>

### Завдання
<p>
Завдання для <code>for</code> <br/> Напишіть код, який буде виводити на екран квадрати всіх цілих чисел від 0 до 10 включно.
</p>

<p>
Завдання для <code>while</code> <br/> Напишіть код, який буде зчитувати цілі числа від користувача, поки сума чисел не перевищить 100. Після зупинки циклу, програма має вивести на екран кількість чисел, які були введені.
</p>

<p>
Завдання для <code>do while</code><br/>
Напишіть код, який буде запитувати користувача про введення паролю і повторювати цей процес до тих пір, поки користувач не введе правильний пароль. Після введення правильного паролю програма має вивести на екран повідомлення "Добро пожаловать!"
</p>




<br/><br/><br/>




## Массивы
### Теорія https://metanit.com/java/tutorial/2.4.php
### Короткий опис:
<p>
Масиви у Java - це контейнери, які можуть містити однотипові елементи. Вони можуть бути створені для зберігання будь-якого типу даних (цілі числа, символи, об'єкти і т.д.). Масив має фіксовану довжину, яка встановлюється при створенні масиву, і не може бути змінена пізніше.
<br/>
Масив може бути створений за допомогою ключового слова new та типу даних, а також повного розміру чи заповнення за замовчуванням. Потім можна доступити до елементів масиву за допомогою індексу, який починається з 0.
   
```
int[] myArray = new int[5]; // створення масиву розміром 5 за замовчуванням значення 0

myArray[0] = 10; // заповнення першого елементу масиву значенням 10

int secondElement = myArray[1]; // отримання значення другого елементу масиву
```

<p>
До масивів також можна застосовувати команди такі як цикли для перебору елементів масиву, методи типу length щоб отримати довжину масиву, методи типу sort щоб відсортувати елементи масиву і т.д.
</p>

### Задачі

<p>
Напишіть код, який буде сортувати масив цілих чисел за зростанням.<br/><br/>
Напишіть код, який знаходить максимальне та мінімальне значення в масиві дробових чисел.<br/><br/>
Напишіть код, який знаходить кількість повторень числа який введе користувач
</p>



<br/><br/><br/>


## Методы
### Теорія <br/> https://metanit.com/java/tutorial/2.7.php <br/> https://metanit.com/java/tutorial/2.16.php <br/> https://metanit.com/java/tutorial/2.17.php
### Короткий опис
<p>
Функція - це блок коду, який виконує певну послідовність операцій та може повертати результат. Функції можуть бути використані для обробки даних, здійснення операцій над об'єктами та організації коду в більш структурованій формі. В Java функції визначаються як методи, в яких можна вказувати аргументи та тип значення яке повертає метод
</p>

```
public class Main {
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("The result is: " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
```

<p>
Цей код містить функцію add, яка приймає два цілих числа та повертає їх суму. В тілі main метода, ми викликаємо функцію add, передаючи їй значення 5 та 10 як аргументи. Результат виклику функції записується у змінну result і виводиться на консоль.
</p>

### Задачі

<p>
Напишіть функцію, яка приймає два цілих числа і повертає найбільше з них.<br/>
Напишіть функцію, яка приймає строку та повертає її в зворотному порядку.<br/>
Напишіть функцію, яка приймає масив чисел та повертає середнє арифметичне елементів масиву.<br/>
Напишіть функцію, яка приймає список строк і повертає список довжин строк.<br/>
Напишіть функцію, яка приймає масив цілих чисел і знаходить найбільше і найменше значення в масиві і повертає їх.<br/>
Напишіть функцію, яка приймає строку і повертає строку з реверсованим порядком слів.
</p>




<br/><br/><br/>




## Перегрузка методов
### Теорія https://metanit.com/java/tutorial/2.18.php
### Короткий опис

<p>
Перезавантаження функцій (overloading) в Java - це механізм, за допомогою якого можна створювати декілька функцій з одним ім'ям, але різними параметрами. Це дозволяє коду бути більш зрозумілим і легше читаємим. В Java перезавантаження можливе тільки якщо метод має різні параметри (число, тип або порядок). Кожен метод повинен мати унікальну сигнатуру, яка складається з імені методу і типу та кількості параметрів.
</p>

### Завдання

<p>
Створити та перезавантажити функції додавання які повертають суму чисел які передали в функцію add(int a, int b), add(int a, int b, int c), add(int a, int b, int c, int d)
</p>



<br/><br/><br/>



## Рекурсивные функции
### Теорія https://metanit.com/java/tutorial/2.8.php
### Короткий опис

<p>
Рекурсивні функції - це функції, які викликають самі себе, доки не досягнуто певної умови зупинки, називається "base case". Рекурсія часто використовується для розв'язання задач, де можна звернутися до більш маленького випадку того ж задачі, щоб розв'язати більший випадок. Важливо мати уявлення про умову зупинки і запевнити, що рекурсивні виклики спричиняють зупинку в кінці. Рекурсивні функції можуть бути ефективні і зручні для написання, але важливо пам'ятати про можливі проблеми з пам'яттю, якщо рекурсія не контролюється.
</p>

### Задачі

<p>
Напишіть рекурсивну функцію, яка виводить числа від 0 до n.<br/>
Напишіть рекурсивну функцію, яка обчислює факторіал числа.<br/>
Напишіть рекурсивну функцію, яка знаходить суму елементів масиву за допомогою рекурсії.<br/>
</p>




<br/><br/><br/>




## Введение в обработку исключений
### Теорія https://metanit.com/java/tutorial/2.10.php
### Короткий опис

<p>
Try-catch - це механізм обробки помилок в Java. Використовується для відловлення та обробки виключень (exceptions) в коді. Блок "try" містить код, який може викликати виключення, а блок "catch" містить код, який виконується, якщо виключення виникає. Також може бути доданий блок "finally", який виконується незалежно від того, чи виникло виключення чи ні.
</p>

### Задачі

<p>
Напишіть метод Java, який приймає масив цілих чисел та індекс елементу, який має бути видалений з масиву. Якщо індекс виходить за межі масиву, метод повинен кидати виключення "ArrayIndexOutOfBoundsException" і виводити повідомлення "Помилка: Вихід за межі масиву.". В блоці "catch" метод має виводити повідомлення "Виключення оброблено."
</p>
