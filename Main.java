class Main {
  public static void main(String[] args) {
    
    Boxes box1 = new Boxes();//Creates a box using the constructor without parameters
    Boxes box2 = new Boxes(10,20,30);//constructs a box with the constructor that accepts parameters
    Boxes box3 = new Boxes(100,200,300);

    System.out.println(box1.getVolume());
    System.out.println(box1.getLength());
    System.out.println(box2.getVolume());
    System.out.println(box2.getLength());
    System.out.println(box3.getVolume());
    System.out.println(box3.getLength());

    box1.setLength(25); 
    System.out.println(box1.getLength());

  }
}