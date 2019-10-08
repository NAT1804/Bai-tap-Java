import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        Week4 s = new Week4();
        int res = s.max2Int(5, 6);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testMax2Int2(){
        Week4 s = new Week4();
        int res = s.max2Int(9, 6);
        Assert.assertEquals(res, 9);
    }

    @Test
    public void testMax2Int3(){
        Week4 s = new Week4();
        int res = s.max2Int(5, 10);
        Assert.assertEquals(res, 10);
    }

    @Test
    public void testMax2Int4(){
        Week4 s = new Week4();
        int res = s.max2Int(5, 6);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testMax2Int5(){
        Week4 s = new Week4();
        int res = s.max2Int(5, 6);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testMinArray1(){
        Week4 s = new Week4();
        int arr[] = {5, 6, 8, 9, 10};
        int res = s.minArray(arr);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testMinArray2(){
        Week4 s = new Week4();
        int arr[] = {7, 16, 11, 9, 10};
        int res = s.minArray(arr);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testMinArray3(){
        Week4 s = new Week4();
        int arr[] = {19, 6, 8, 15, 10};
        int res = s.minArray(arr);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testMinArray4(){
        Week4 s = new Week4();
        int arr[] = {20, 16, 8, 9, 10};
        int res = s.minArray(arr);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testMinArray5(){
        Week4 s = new Week4();
        int arr[] = {10, 13, 19, 9, 11};
        int res = s.minArray(arr);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testCalculateBMI1(){
        Week4 s = new Week4();
        String res = s.calculateBMI(55, 1.7);
        Assert.assertEquals(res, "Thiếu cân");
    }

    @Test
    public void testCalculateBMI2(){
        Week4 s = new Week4();
        String res = s.calculateBMI(55, 1.7);
        Assert.assertEquals(res, "Thiếu cân");
    }

    @Test
    public void testCalculateBMI3(){
        Week4 s = new Week4();
        String res = s.calculateBMI(55, 1.7);
        Assert.assertEquals(res, "Thiếu cân");
    }

    @Test
    public void testCalculateBMI4(){
        Week4 s = new Week4();
        String res = s.calculateBMI(55, 1.7);
        Assert.assertEquals(res, "Thiếu cân");
    }

    @Test
    public void testCalculateBMI5(){
        Week4 s = new Week4();
        String res = s.calculateBMI(55, 1.7);
        Assert.assertEquals(res, "Thiếu cân");
    }
}
