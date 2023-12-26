package ex11;

public class homework2 {

  public static void main(String[] args) {
    Member mem1 = new Member();
    mem1.print();

    System.out.println(mem1.equals("abc", "def"));

    Member mem2 = new Member("abc", "def", "abc@naver.com");
    mem2.print();

    System.out.println(mem2.equals("abc", "def"));
  }
}

class Member {

  //멤버변수 : 아이디, 비번, 이메일
  private String id, pw, email;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  //getter setter

  //equals : 아이디, 비번이 주어지면 내 정보와 일치 여부 알려주는 메서드
  public boolean equals(String id, String pw) {
    if (this.id == null) {
      return false;
    }
    if (this.pw == null) {
      return false;
    }
    if (this.id.equals(id) && this.pw.equals(pw)) {
      return true;
    }
    return false;
  }

  public Member() {}

  //생성자 : 기본생성자, 아이디, 비번, 이메일이 필요한 생성자, 아이디, 이번이 필요한 생성자
  public void print() {
    System.out.println("아이디 :" + id);
    System.out.println("이메일 :" + email);
    System.out.println("비밀번호 :" + pw);
  }

  public Member(String id, String pw, String email) {
    this.id = id;
    this.pw = pw;
    this.email = email;
  }
}
