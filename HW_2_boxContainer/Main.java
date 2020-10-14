package HW_2_boxContainer;

public class Main {

  public static void main(String[]args){
        Box myBox = new Box();
        Shape circle = new Shape();
        Shape rectangle = new Shape();

        myBox.setBox_volume(150);
        circle.setVolume(60);
        rectangle.setVolume(150);

//      System.out.println(myBox.getBox_volume());
        myBox.add(circle); // expected true
        myBox.add(rectangle); // expected false

    }

}
