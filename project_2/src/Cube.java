public class Cube extends SolidAbstract{
    int rib;
    public  Cube(int A) {
        rib = A;
    }
    public double GetSurfaceArea() {
        return 6 * Math.pow(rib, 2);
    }

    @Override
    public void GetData() {
        System.out.println("rib: " +rib);
    }
}
