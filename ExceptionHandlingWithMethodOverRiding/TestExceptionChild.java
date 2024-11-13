package ExceptionHandlingWithMethodOverRiding; 

class Parent{    
  void msg() {  
    System.out.println("parent method");  
  }    
}    
    
class TestExceptionChild extends Parent{    
  void msg()throws ArithmeticException {    
    System.out.println("child method");    
  }    
  
  public static void main(String args[]) {    
   Parent p = new TestExceptionChild();    
   p.msg();    
  }    
}   