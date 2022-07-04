import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void uniquePathsExamples1() {
    assertEquals(28, sol.uniquePaths(3,7));
  }
  @Test
  void uniquePathsExamples2() {
    assertEquals(3, sol.uniquePaths(3,2));
  }
}