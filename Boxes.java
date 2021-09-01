public class Boxes{
int length, width, height;
//default constructor for the Boxes class
public Boxes(){
 length = 5;
 width = 5;
 height = 5;
}
//second constructor that takes parameters
public Boxes(int l, int w, int h){
  length = l;
  width =w;
  height =h;
}

//method with an integer return type
public int getVolume(){
  return length*width*height;
}

//method that does not accept a parameter and returns an int
public int getLength(){
  return length;
}

//method that accepts an integer parameter and returns nothing
public void setLength(int sl){
  length = sl;
}









}