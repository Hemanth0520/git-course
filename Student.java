class Student{
    //int nextId = id +10;
    //int id;   // default value is zero for instance variables
    //id = 1000;
    int id = 1000;
    //int nextId = id +10;

    byte age = 1_8;
    //byte rank = 165; // [-128,127]       possible lossy conversion from int to byte
    short rank = 165;
    int phone = 1234567890;
    //int phone1 = 2234567890;  //error: integer number too large
    //int phone1 = 2234567890L;   //error: incompatible types: possible lossy conversion from long to int
    long phone1 = 223_456_7890L;

    // Integer literal:: int literal, long literal

    char degree = 'B';
    //char degree1 = B; // error: cannot find symbol B
    
    //char degree2 = '';  //  error: empty character literal
    char degree2 = ' ';   //works fine
    char degree3 = '\u0042';
    //char degree4 = '\U0042';   //compile error
    char degree4;

    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;

    float gpa = 3.79f;
    //float gpa1 = 4.0;   // error: incompatible types: possible lossy conversion from double to float
    double gpa1 = 4.0;

    void compute(){
        //int id;                 // local variables do not get any default values
        //id = 1000;
        //id = "Hemanth";
        int nextId = id +10;
        System.out.println("id: "+id);
        System.out.println("nextId: "+ nextId);
        System.out.println("age: "+age);
        System.out.println("phone1: "+phone1);
        System.out.println("minValue: "+minValue);
        System.out.println("maxValue: "+maxValue);

        System.out.println("gpa: "+gpa);
        System.out.println("gpa1: "+gpa1);
        System.out.println("degree: "+degree);
        System.out.println("degree2: "+degree2);
        System.out.println("degree3: "+degree3);
        System.out.println("degree4: "+degree4);
    }

    public static void main(String[] args){
        Student s = new Student();
        s.compute();
    }
}