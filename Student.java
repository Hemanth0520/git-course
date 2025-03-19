class Student{
    //int nextId = id +10;
    //int id;   // default value is zero for instance variables
    //id = 1000;
    int id = 1000;
    //int nextId = id +10;

    void compute(){
        //int id;                 // local variables do not get any default values
        //id = 1000;
        //id = "Hemanth";
        int nextId = id +10;
        System.out.println("id: "+id);
        System.out.println("nextId: "+ nextId);
    }

    public static void main(String[] args){
        Student s = new Student();
        s.compute();
    }
}