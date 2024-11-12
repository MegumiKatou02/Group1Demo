import org.junit.Before;
import org.junit.Test;

import view.Program;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    private Program program;

    // Trước mỗi bài kiểm tra, tạo đối tượng Program mới
    @Before
    public void setUp() {
        program = new Program();
    }

    @Test
    public void testLabels() {
        assertEquals("Group 1", program.getNameGroup().getText());
    }
}
