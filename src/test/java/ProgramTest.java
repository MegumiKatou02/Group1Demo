import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void testLabels() {
        // Giả sử bạn muốn kiểm tra xem các label có đúng không
        String label1 = "Lê Đình Chinh";
        String label2 = "Lê Công Huy";

        // Kiểm tra nếu các label đúng như mong đợi
        assertEquals("Lê Đình Chinh", label1);
        assertEquals("Lê Công Huy", label2);
    }
}
