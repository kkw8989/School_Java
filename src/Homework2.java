import java.util.Scanner;

class Student {
    private long id;
    private String name;
    private String major;
    private long phone;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }

    public String getFormattedPhone() {
        // 앞의 0이 날아갔으니 10자리로 맞춰서 복구
        String s = Long.toString(phone);
        while (s.length() < 10) {
            s = "0" + s;
        }
        // 010-xxxx-xxxx 형태로 하이픈 삽입
        return s.substring(0, 3) + "-" + s.substring(3, 7) + "-" + s.substring(7);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = 3;
        Student[] students = new Student[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            long id = sc.nextLong();
            String name = sc.next();
            String major = sc.next();
            String phoneInput = sc.next();

            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setMajor(major);
            s.setPhone(Long.parseLong(phoneInput)); // 앞의 0은 자동으로 사라짐

            students[i] = s;
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            System.out.println((i + 1) + "번째 학생: " + s.getId() + " "
                    + s.getName() + s.getMajor() + " " + s.getFormattedPhone());
        }
    }
}