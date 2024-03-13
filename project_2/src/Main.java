//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println("S cube="+cube.GetSurfaceArea());
        RectSolid rectSolid = new RectSolid(5,7,8);
        System.out.println("S rectangle=" +rectSolid.GetSurfaceArea());
        cube.GetData();
        rectSolid.GetData();
    }
}