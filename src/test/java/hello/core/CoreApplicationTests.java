package hello.core;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoreApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void test1() {
    // 모든 요소들에 대해서 차례대로
    // filter(c,python,java 순서) -> map(동일) 순으로 되는줄 알았는데
    // 하나씩 하는구나.
    // filter(c) c탈락-> filter(python) -> map(python) pyth -> findFirst
    Arrays.stream(new String[]{"c", "python", "java"})
        .filter(word -> {
          System.out.println("Call filter method: " + word);
          return word.length() > 3;
        })
        .map(word -> {
          System.out.println("Call map method: " + word);
          return word.substring(0, 3);
        }).findFirst();

    System.out.println("----------");

    List temp = Arrays.stream(new String[]{"c", "python", "java"})
        .map(word -> {
          System.out.println("Call map method: " + word);
          return word.toUpperCase();
        })
        .skip(2)
        .collect(Collectors.toList());
    temp.stream().forEach(System.out::println);
  }


  @Test
  void test2() {
    Scanner in = new Scanner(System.in);
//    String s1 = in.next().toString();
    String s1 = "eitoiw iruow witouweiotwiowioei eiiuow e";
    String[] s1Array = s1.split(" ");
    int max = Integer.MIN_VALUE;
    String ans = "";
    for (String s : s1Array) {
      if (s.length() > max) {
        max = s.length();
        ans = s;
      }
    }
    System.out.println(ans);
  }

  @Test
  void test3() {
    Scanner in = new Scanner(System.in);
//    int cnt = in.nextInt();
    int cnt = 2;
    while (cnt-- != 0) {
      StringBuilder sb = new StringBuilder();
      Stack<String> st = new Stack<>();
//      String s1 = in.next();
      String s1 = "";
      if (cnt == 1) {
        s1 = "good";
      } else {
        s1 = "Time";
      }
      for (char x : s1.toCharArray()) {
        st.push(x + "");
      }
      while (!st.isEmpty()) {
        sb.append(st.pop());
      }
      System.out.println("----");
      System.out.println(sb);
    }
  }

  @Test
  void test() {
    String s1 = "123123";
    int pos = 1;
    // substring(int idx) 는 idx부터(포함) 끝까지. index는 0부터
    s1 = s1.substring(pos, 5); // pos 포함, 5 미포함
    System.out.println(s1);
  }
}
