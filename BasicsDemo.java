class BasicsDemo{

    //1.Naming rules for classes/methods and variables

            //a. First character:: letter, underscore, $
            //b. Remaining:: letter, underscore, $, numbers
            //c. No reserved keywords.

            int a =0;
            //int a=1;
            //int 1id = 0;
            //int private = 7;
            void foo(){}
            //void foo(){}

            int $id =9;
    //2. Java is case-sensitive
     int id= 5;
     int Id= 5;
     int ID =6;
     int iD = 7;

     void stu(){}
     void Stu(){}

    

    public static void main(String[] args){
        //print();
        System.out.println("Arithmetic");
        print();

        primitives();
        //5. Arithmetic Operations 
        int i = 65;
        int j= 15;

         System.out.println(i+j);
         System.out.println(i-j);
         System.out.println(i*j);
         System.out.println(i/j);
         System.out.println(i%j);
    }

    //3. Printing to console
    static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
    //System.out.println("world!!");
  }
  static void primitives() {
	      System.out.println("\n\nInside primitives ...");
		  int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
      //long intHex = 0x0041L; //this will also work
		  System.out.println("intHex: " + intHex);
		  
		  // Java 7
		  int intBinary = 0b0100_0001;
		  System.out.println("intBinary: " + intBinary);
		  
		  int intOctal = 0101;
		  System.out.println("intOctal: " + intOctal);
	  }


  // comments or disable codes 
  // single line double slashes
  /* to comment out block of code

  rggetgvg   */


}