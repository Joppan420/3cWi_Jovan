package at.ran.OO.Phones;

public class Camera {
    private int fileNumber = 0;

    public void takePicture(){
        PhoneFile file = new PhoneFile("jpg", "1000", 10);
        fileNumber ++;
        return file;
    }
}
