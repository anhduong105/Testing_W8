import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class phuongTrinhBac2Test {

    @Test
    void solve() {
        assertEquals("x1 = 1.0, x2 = -1.2",phuongTrinhBac2.solve(5,1,-6));
    }

    @Test
    void solve2() {
        assertEquals("Nghiem kep: -1.0",phuongTrinhBac2.solve(1,2,1));
    }

    @Test
    void solve3() {
        assertEquals("Nghiem duy nhat: 2.0",phuongTrinhBac2.solve(0,5,-10));
    }
}