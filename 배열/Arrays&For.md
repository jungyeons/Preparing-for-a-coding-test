# 📘 Java 배열과 반복문

Java에서 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 데 사용됩니다. 반복문(loop)는 특정 작업을 반복적으로 수행하는 데 사용되며, 배열과 함께 사용하면 배열의 모든 요소에 대해 작업을 수행할 수 있습니다.

## 📝 예제 코드

```java
public class Main {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "오렌지"}; // 문자열 배열 생성

        // for 반복문을 이용해 배열의 모든 요소 출력
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // '키위'로 모든 요소 변경
        for(int i = 0; i < fruits.length; i++) {
            fruits[i] = "키위";
        }

        // enhanced for (for-each) 반복문을 이용해 변경된 배열의 모든 요소 출력
        for(String fruit : fruits) {
            System.out.println(fruit); // 모든 요소가 '키위'로 변경되었으므로 '키위' 출력
        }
    }
}
```

## 🎯 주요 특성 및 메서드

- 배열 생성  : `type[] arrayName = {element1, element2, element3, ...};`를 사용하여 생성합니다. 이때 `type`은 배열에 저장할 데이터의 타입입니다.
- for 반복문  : `for(int i = 0; i < arrayName.length; i++) { ... }`를 통해 배열의 모든 요소에 대해 작업을 수행할 수 있습니다. 이때 `i`는 인덱스를 나타내며, 0부터 시작하여 배열의 길이(`length`)보다 작을 동안 반복합니다.
- 요소 변경  : `arrayName[index] = newValue;`를 통해 특정 인덱스의 요소를 바꿀 수 있습니다.
- enhanced for (for-each) 반복문  : `for(type element : arrayName) { ... }`를 통해 배열의 모든 요소에 대해 작업을 수행할 수 있습니다. 이 방식을 사용하면 인덱스를 직접 관리할 필요 없이 각 요소에 쉽게 접근할 수 있습니다.
