import javax.swing.plaf.nimbus.AbstractRegionPainter;

interface Abstraction {
  public void print();
  public static int test1 = 1;
  public final int test2 = 3;

  public int test3 = 4;

  public static final int finalInt = 5;
}
class NewAbstraction implements Abstraction{
    public NewAbstraction(int a){
     ;
        System.out.println("in child class");
        System.out.println("static field: "+test1);
        System.out.println("final field: " + test2);
        System.out.println("not static field: " + test3);
        System.out.println("static final int: " + finalInt);
    }
    public void print(){
        System.out.println("Printing in contract fullfiller");
    }


    public static void main(String[] args) {
        Abstraction test = new NewAbstraction(5);
    }
}
