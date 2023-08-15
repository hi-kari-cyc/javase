package shujia25.day13.test;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;

/*
        键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台

 */
public class SetTest1 {
    public static void main(String[] args) {
        TreeSet<StudentScore> ss = new TreeSet<>(new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore o1, StudentScore o2) {
                    return o2.allScore()- o1.allScore();
            }
        });

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("请输入一个学生的信息");
            StudentScore s = new StudentScore();
            System.out.print("姓名：");
            s.setName(sc.next());
            System.out.print("语文成绩：");
            s.setChinese(sc.nextInt());
            System.out.print("数学成绩：");
            s.setMath(sc.nextInt());
            System.out.print("英语成绩：");
            s.setEnglish(sc.nextInt());
            ss.add(s);
        } while (ss.size() < 5);
        System.out.println(ss);
    }
}

class StudentScore{
    private String name;
    private int chinese;
    private int math;
    private int english;

    public StudentScore() {
    }

    public StudentScore(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "[" + "姓名：'" + name + '\'' + ", 语文成绩：" + chinese + ", 数学成绩：" + math + ", 英语成绩：" + english + ']' + "\n";
    }

    public int allScore() {
        return chinese + math + english;
    }


}
