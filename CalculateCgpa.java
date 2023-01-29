public class CalculateCgpa {
    public static void main(String[] args) {
        float subject1 = 76 ;
        float subject2 =86 ;
        float subject3 = 82 ;
        float subject4 = 79 ;
        float subject5 = 76 ;
        float subject6 = 80;
        //According to pakistan cgpa rule total have 4 gpa thats why for six subject we divided by 150 (600/4 = 150)
        float cgpa = (subject1 + subject2 + subject3 + subject4 + subject5 +subject6) / 150;
        System.out.println(cgpa);
    }
}
