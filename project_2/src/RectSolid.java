import org.w3c.dom.css.Rect;

public class RectSolid extends SolidAbstract {
    int length;
    int width;
    int height;
    public  RectSolid(int L, int W, int H){
        length = L;
        width = W;
        height = H;
    }
    public double GetSurfaceArea(){
        return 2 * ((width*length) + (width* height) + (height*length));
    }

    @Override
    public void GetData() {
        System.out.println("length: " +length);
        System.out.println("width: " +width);
        System.out.println("height: " +height);
    }
}
