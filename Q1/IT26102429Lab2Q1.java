public class IT26102429Lab2Q1{

  public static void main(String[] args){
  
  int perimeter=100;
  
  double length;
  double width;
  
  double widthratio=0.75;
  
   length=perimeter/(2*(1+widthratio));
  
   width=widthratio* length;
  
  System.out.println("length of fence:"+ length);
  
  System.out.println("width of fence:"+ width);
  }
  
}