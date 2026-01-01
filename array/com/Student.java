package array.com;

public class Student {
    String name;
    int roll_no;

    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRoll_no(){
        return roll_no;
    }

    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student("Ritu", 10);
        arr[1] = new Student("Jagu", 20);
        arr[2] = new Student("Heena", 30);
        arr[3] = new Student("Tanya", 40);
        arr[4] = new Student("Sita", 50);

        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i].name + " : " + arr[i].roll_no);
        }

    }
}
