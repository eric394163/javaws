package ex11;

public class Student {

    private int grade, classNum, num;
    private String name;
    private Subject[] subjects;
    private int count = 0;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    // 과목 추가 메서드
    public boolean insertSubject(String title, int score) {
        for (Subject tmp : subjects) {
            if (tmp != null && tmp.equals(title)) {
                return false;
            }
        }
        subjects[count] = new Subject(title, score);
        count++;
        expandSubject();

        return true;
    }

    private void expandSubject() {
        // 아직 안 찬 경우
        if (subjects.length > count) {
            return;
        }
        // 배열이 꽉 찬 경우 늘려주기
        Subject[] tmplist = new Subject[subjects.length + 5];
        System.arraycopy(subjects, 0, tmplist, 0, subjects.length);
        subjects = tmplist;
    }

    // 과목 삭제 메서드
    public boolean deleteSubject(String title) {
        // 삭제할 과목이 어디 있는지 확인하기 위한 변수, 인덱스 이기에 -1이면 없음 0이상이면 있음
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (subjects[i].equals(title)) {
                index = i;
            }

        }
        if (index == -1) {
            return false;
        }
        // 있으면 삭제될 예정이라 전체 개수에서 하나 빼기
        count--;
        if (index == count - 1) {
            // 추가할 떄 향상된 for문을 사용해서 삭제된 항목을 null로 수정해야함
            subjects[index] = null;
            return true;
        }
        Subject[] tmpList = new Subject[subjects.length];

        // 기존 과목 전체 복사
        System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
        // 앞으로 당겨주는 작업
        System.arraycopy(tmpList, index + 1, subjects, index, count - index);
        subjects[index] = null;
        return true;
    }

    // 성적 수정 메서드
    public boolean updateSubject(String title, int score) {
        for (Subject tmp : subjects) {
            if (tmp != null && tmp.equals(title)) {
                tmp.updateScore(score);
                return true;
            }
        }
        return false;
    }

    // 학생 정보 출력 메서드
    public void print() {
        System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name);
        for (Subject tmp : subjects) {
            if (tmp != null) {
                tmp.print();
            }
        }
    }

    public Student(int grade, int classNum, int num, String name) {
        this.grade = grade;
        this.classNum = classNum;
        this.num = num;
        this.name = name;
        subjects = new Subject[5];
    }

}
