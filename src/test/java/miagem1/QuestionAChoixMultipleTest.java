package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionAChoixMultipleTest {
    private String enoncer;
    private List<Integer> score;
    private QuestionAChoixMultiple q;

    @Before
    public void setUp() throws Exception {
        this.enoncer = "Quel est la taille moyenne d'une banane ?";
        this.score = new ArrayList<>();
        this.score.add(1);
        this.score.add(4);
        this.score.add(8);
        this.score.add(14);
        this.q = new QuestionAChoixMultiple(this.enoncer, this.score);
    }

    @Test
    public void testGetEnonce() {
        assertEquals("L'énoncer ne correspond pas !", enoncer, q.getEnonce());
    }

    @Test
    public void testGetScoreForIndice() {
        assertEquals("Le score ne correspond pas !", 25, q.getScoreForIndice(14), 0.0);
        assertNotEquals("Le score ne correspond pas !", 0, q.getScoreForIndice(30));
    }
}
