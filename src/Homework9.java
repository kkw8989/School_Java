import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // db.txt에서 ID와 비밀번호 쌍 읽기 (상대경로)
        try {
            Scanner fileScanner = new Scanner(new File("db.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split("\\s+");
                if (parts.length >= 2) {
                    map.put(parts[0], parts[1]);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = scanner.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.print("password : ");
            String password = scanner.nextLine().trim();

            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        scanner.close();
    }
}