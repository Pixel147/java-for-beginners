# java-for-beginners
## Цей короткий курс по джаві поділяється на
1. Теорія з [Metanit.com](https://metanit.com/java/tutorial/)
2. Короткий опис
3. Декілька завдань(до деяких тем немає завдань :) )




<br/><br/><br/>




## Змінні та константи
<p>Теорія https://metanit.com/java/tutorial/2.11.php</p>
<p>Короткий опис:</p>
<p>В Java, змінні це місце, де можна зберігати дані. Вони мають ім'я і тип, так само як і константи. Різниця між ними в тому, що значення змінної може бути змінене в процесі виконання програми, в той час як константа має фіксоване значення і не може бути змінена під час виконання програми. Для оголошення константи в Java використовується слово final перед типом змінної.

```final int MAX_VALUE = 100;```

Змінні і константи створюються для того, щоб зберігати і передавати дані між різними частинами програми. Використання констант може допомогти захистити дані від несанкціонованого зміни і зберегти цілісність даних.</p>




<br/><br/><br/>




## Типи данних
<p>Теорія https://metanit.com/java/tutorial/2.12.php</p>
<p>Короткий опис:</p>
<p>Java підтримує багато типів даних, включаючи:
Цілі типи даних: byte, short, int, long
Типи даних з плаваючою комою: float, double
Логічний тип: boolean
Символьний тип: char
Java також підтримує слабку типізацію, тобто можливість використання змінної без вказування типу даних. Також, є система автоматичного перетворення типів (наприклад, можна завершити ціле число до типу double).
Типи данних в Java також можуть бути складні відносно простих типів, такі як Array, Strings, Enums, Classes.</p>




<br/><br/><br/>




## Консольный ввод/вывод в Java
<p>Теорія https://metanit.com/java/tutorial/2.9.php</p>
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
<p>Теорія https://metanit.com/java/tutorial/2.3.php</p>
<p>Короткий опис:</p>
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
<p>Теорія https://metanit.com/java/tutorial/2.3.php</p>
<p>Короткий опис:</p>
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
<p>Теорія https://metanit.com/java/tutorial/2.3.php</p>
<p>Короткий опис:</p>
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
Важливо зауважити, що програма буде виконувати тільки перший блок коду який співпадає з умовою, тому `рекомендується об'являти' умови від найбільш специфічної до найбільш загальної.`
</p>
<p>Задачі</p>
<p>
Напишіть програму, яка зчитує вік користувача та виводить "Ви молоді" якщо вік менше 18 років, "Ви дорослі" якщо вік більше 18 років, та "Ви маєте 18 років" якщо вік дорівнює 18 років.
</p>
<p>
Напишіть програму, яка зчитує число та виводить "Число парне", якщо ж число непарне вивести "Число непарне"
</p>
