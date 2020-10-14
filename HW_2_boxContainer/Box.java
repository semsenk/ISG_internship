package HW_2_boxContainer;

public class Box {
    int box_volume = 200;

    public void setBox_volume(int box_volume) {
        this.box_volume = box_volume;
    }

    public int getBox_volume() {
        return box_volume;
    }

    public boolean add(Shape piched_shape) {
        if (box_volume >= piched_shape.getVolume()) {
            box_volume -= piched_shape.getVolume();
            System.out.printf("true");
            return true;
        }
        else {
            System.out.printf("false");
            return false;
        }
    }
}