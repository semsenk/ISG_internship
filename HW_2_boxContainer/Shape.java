package HW_2_boxContainer;

public class Shape {
    int volume;

    public void setVolume(int volume){
        if (volume > 0){
            this.volume = volume;
        }
        else {
            this.volume = 0;
        }
    }

    public int getVolume() {
        return volume;
    }

}