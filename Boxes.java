public class Boxes{
int length, width, height;
//default constructor for the Boxes class
public Boxes(){
 length = 5;
 width = 5;
 height = 5;
}

public Boxes(int l, int w, int h){
  length = l;
  width =w;
  height =h;
}

//method with an integer return type
public int getVolume(){
  return length*width*height;
}

public int getLength(){
  return length;
}

public void setLength(int sl){
  length = sl;
}









}