package ex08;

public class ArgsMethod {

  public static void main(String[] args) {
    //가변 매개변수 활용 (배열 추가 없이 사용 가능)
    System.out.println(sum());
    System.out.println(sum(1));
    System.out.println(sum(1, 2));
    System.out.println(sum(1, 2, 3));

    //매개변수가 배열이면 배열 한개 넘겨줌
    System.out.println(sum2(new int[0]));
    System.out.println(sum2(new int[] { 1 }));
    System.out.println(sum2(new int[] { 1, 2 }));
    System.out.println(sum2(new int[] { 1, 2, 3 }));
  }

  //주어진 정수들의 합을 계산하는 메서드FFFFF
  public static int sum(int... nums) {
    int sum = 0;
    if (nums.length == 0) {
      return 0;
    }
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }

  public static int sum2(int[] nums) {
    int sum = 0;
    if (nums.length == 0) {
      return 0;
    }
    for (int num : nums) {
      sum += num;
    }
    return sum;
  }
}
