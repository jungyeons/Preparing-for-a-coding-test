# 📘 Java 배열 메서드 

Java에서 배열은 객체로 취급되지만, 일반적인 객체들이 가진 메서드 대신 기본적으로 `length` 속성만을 가지고 있습니다. 그러나 Java의 `Arrays`라는 유틸리티 클래스는 배열 관련 다양한 메서드를 제공하므로, 이를 활용하여 배열에 대한 다양한 작업을 수행할 수 있습니다.

## 📝 예제 코드

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 1, 7, 3}; // 정수 배열 생성

        Arrays.sort(numbers); // 배열 정렬
        System.out.println(Arrays.toString(numbers)); // 배열 출력 : [1, 2, 3, 5, 7]

        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length); // 배열 복사
        System.out.println(Arrays.toString(copiedNumbers)); // 복사된 배열 출력 : [1, 2, 3, 5, 7]

        Arrays.fill(numbers, 0); // 배열의 모든 요소를 0으로 채움
        System.out.println(Arrays.toString(numbers)); // 배열 출력 : [0, 0, 0, 0, 0]

        boolean areEqual = Arrays.equals(numbers, copiedNumbers); // 두 배열이 같은지 비교
        System.out.println(areEqual); // 결과 출력 : false
    }
}
```

## 🎯 주요 메서드

- `Arrays.sort(array)` : 배열을 오름차순으로 정렬합니다.
- `Arrays.toString(array)` : 배열의 모든 요소를 문자열 형태로 출력합니다.
- `Arrays.copyOf(original, length)` : 원본 배열을 복사하여 새로운 배열을 만듭니다. 여기서 `length`는 새 배열의 길이입니다.       
:star:  `Arrays.copyOf()`는 특정 배열의 원하는 길이만큼 새로운 배열로 복사하는 메소드 함수입니다. 새로운 배열 = Arrays.copyof(원본 배열, 원본 배열에서 복사하고 싶은 요소들의 길이); 식으로 사용됩니다.
- `Arrays.fill(array, value)` : 배열의 모든 요소를 주어진 `value`로 채웁니다.
- `Arrays.equals(array1, array2)` : 두 배열이 같은지 비교합니다. 같으면 `true`, 다르면 `false`를 반환합니다.
- `Arrays.binarySearch(array, key)`  : 정렬된 배열에서 주어진 `key`를 이진 검색 알고리즘으로 검색합니다. 검색된 요소의 인덱스를 반환합니다. `key`가 배열에 없으면 음수를 반환합니다.
