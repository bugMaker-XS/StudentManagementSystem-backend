import java.util.Scanner;

public class StudentManagement {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getMenu() {
        System.out.print("--------------------欢迎来到学生管理系统--------------------\n");
        System.out.print("1. 增加学生\n");
        System.out.print("2. 删除学生\n");
        System.out.print("3. 修改学生\n");
        System.out.print("4. 查询学生\n");
        System.out.print("5. 退出系统\n");
        System.out.print("请选择你要进行的操作：");

        return scanner.next();
    }
}
