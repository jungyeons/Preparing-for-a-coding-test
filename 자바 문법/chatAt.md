# :memo: `charAt`

`charAt`은 Java에서 `String` 클래스의 메서드로, 문자열에서 특정 위치에 있는 문자를 반환하는 역할을 합니다. 이 메서드는 0부터 시작하는 인덱스를 사용하여 문자열의 각 문자에 접근할 수 있도록 해줍니다.

📋 **메서드 형식:**
```java
public char charAt(int index)
```

🔍 `index`는 접근하려는 문자의 위치를 나타내는 매개변수입니다. 반환값은 해당 위치에 있는 문자입니다.

✨ 다음은 `charAt` 메서드를 사용한 예시입니다:
```java
String str = "Hello, world!";
char ch = str.charAt(4);
System.out.println(ch); // 출력 결과: o
```

위의 예시에서는 문자열 "Hello, world!"에서 인덱스 4에 위치한 문자 'o'를 반환합니다. `charAt` 메서드를 호출할 때 4를 전달하여 해당 위치의 문자를 얻습니다.

🔑 주의할 점은 `charAt` 메서드의 인덱스는 0부터 시작한다는 점입니다. 따라서 첫 번째 문자에 접근하려면 0을, 두 번째 문자에 접근하려면 1을 인덱스로 사용해야 합니다.

```java
String str = "Java";
char firstChar = str.charAt(0);
char secondChar = str.charAt(1);
System.out.println(firstChar); // 출력 결과: J
System.out.println(secondChar); // 출력 결과: a
```

위의 예시에서는 문자열 "Java"에서 첫 번째 문자 'J'와 두 번째 문자 'a'를 반환하여 출력합니다.

❗️ `charAt` 메서드를 사용하여 문자열의 범위를 벗어난 인덱스에 접근하려고 하면 `StringIndexOutOfBoundsException` 예외가 발생합니다. 따라서 인덱스 값을 조심히 선택해야 합니다.

