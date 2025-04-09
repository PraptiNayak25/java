class methodover {
    public static void main(String[] args) {
        
        Student s = new Student("Ram", 20);

        
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}
class Student {
    String name;
    int age;
    int fee;
   
    public Student() {
        name = "unknown";
        age = 0;
        int fee;
    }

    
    public Student(String name, int age,int fee) {
        this.name = name;  
     
   this.age = age;
   this.fee=fee;
    }
}


