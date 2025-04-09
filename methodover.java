public class methodover {
    public static void main(String[] args) {
        
        Student s = new Student("Ram", 20);

        
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}
class Student {
    String name;
    int age;

   
    public Student() {
        name = "unknown";
        age = 0;
    }

    
    public Student(String name, int age) {
        this.name = name;  
        this.age = age;
    }
}


