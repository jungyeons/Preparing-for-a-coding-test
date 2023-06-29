# 📘 Java ArrayList 메서드 

`ArrayList`는 Java의 표준 데이터 구조 중 하나로, 동적으로 크기를 조정할 수 있는 배열입니다. ArrayList는 List 인터페이스를 구현하며, 데이터의 추가, 수정, 삭제 등의 다양한 작업을 수행할 수 있습니다. ArrayList는 객체를 저장하기 때문에 기본 데이터 타입은 직접 저장할 수 없지만, 이를 위해 자동 박싱이 제공됩니다.

## 📝 예제 코드

```java
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // ArrayList 생성

        list.add("사과"); // "사과" 추가
        list.add("바나나"); // "바나나" 추가
        list.add(0, "오렌지"); // index 0에 "오렌지" 추가

        System.out.println(list); // ArrayList 출력 : [오렌지, 사과, 바나나]

        list.remove("사과"); // "사과" 삭제
        System.out.println(list); // ArrayList 출력 : [오렌지, 바나나]

        list.remove(0); // index 0에 있는 요소 삭제
        System.out.println(list); // ArrayList 출력 : [바나나]

        list.set(0, "키위"); // index 0의 요소를 "키위"로 변경
        System.out.println(list); // ArrayList 출력 : [키위]

        System.out.println(list.size()); // ArrayList의 크기 출력 : 1

        System.out.println(list.contains("키위")); // ArrayList가 "키위"를 포함하고 있는지 출력 : true
    }
}
```

## 🎯 주요 메서드

- `add(E e)`  : 리스트의 끝에 요소를 추가합니다.
- `add(int index, E element)`  : 지정된 인덱스에 요소를 추가합니다.
- `remove(Object o)`  : 첫 번째로 나타나는 특정 요소를 ArrayList에서 제거합니다.
- `remove(int index)`  : 지정된 인덱스의 요소를 ArrayList에서 제거합니다.
- `set(int index, E element)`  : 지정된 인덱스의 요소를 바꿉니다.
- `size()`  : ArrayList의 크기(요소의 수)를 반환합니다.
- `contains(Object o)` 🟪 : ArrayList가 특정 요소를 포함하고 있는지 확인합니다. 해당 요소가 있으면 true를, 없으면 false를 반환합니다.
