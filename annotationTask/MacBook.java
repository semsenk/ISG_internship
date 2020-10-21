package annotationTask;

@Laptop(os = "macOS")
public class MacBook {
    String model;
    int display;

    public MacBook(String model,int display) {
        this.model = model;
        this.display = display;
    }

}
