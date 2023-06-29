# 📘 Java 향상된 for문 (Enhanced For Loop)

향상된 for문(또는 for-each문)은 Java 5부터 도입된 기능으로, 배열 또는 컬렉션의 모든 요소에 대해 순차적으로 접근하는 데 편리합니다. 이는 인덱스를 직접 관리할 필요 없이, 가독성이 좋고 코드가 간결해지는 장점이 있습니다.

## 📝 예제 코드

```java
public class Main {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "오렌지"}; // 문자열 배열 생성

        // 향상된 for문을 이용해 배열의 모든 요소 출력
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // 향상된 for문으로는 배열의 요소를 직접 변경할 수 없음
        // 아래의 코드는 '키위'를 출력하지만, 실제 배열의 요소를 변경하지는 않음
        for(String fruit : fruits) {
            fruit = "키위";
            System.out.println(fruit); 
        }

        // 배열의 실제 요소를 확인하면 '키위'로 변경되지 않았음을 확인할 수 있음
        for(String fruit : fruits) {
            System.out.println(fruit); 
        }
    }
}
```

## 🎯 주요 특성

- 향상된 for문  : `for(type element : collection) { ... }` 형식을 따릅니다. `type`은 컬렉션의 요소 타입이며, `element`는 각 요소에 대한 참조 변수입니다. `collection`은 순회할 배열이나 컬렉션입니다.
- 요소 접근  : 향상된 for문은 순서대로 각 요소에 접근합니다. 이는 인덱스를 직접 관리할 필요 없이, 각 요소에 쉽게 접근할 수 있게 해줍니다.
- 요소 변경  : 향상된 for문에서 요소 참조 변수(`element`)를 통해 값을 변경하더라도 원본 배열이나 컬렉션에는 반영되지 않습니다. 이는 참조 변수가 실제 요소를 가리키는 것이 아니라, 요소의 복사본을 가리키기 때문입니다. 따라서 배열이나 컬렉션의 요소를 변경하려면 전통적인 for문을 사용해야 합니다.
