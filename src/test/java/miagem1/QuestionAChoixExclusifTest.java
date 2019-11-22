package miagem1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class QuestionAChoixExclusifTest {
    private String enoncer;
    private int score;
    private QuestionAChoixExclusif q;

    @Before
    public void setUp() throws Exception {
        this.enoncer = "Quel est la taille moyenne d'une banane ?";
        this.score = 14;
        this.q = new QuestionAChoixExclusif(enoncer, score);
    }

    @Test
    public void testgetEnonce() {
        assertEquals("L'énoncer ne correspond pas !", enoncer, q.getEnonce());
    }

    @Test
    public void testgetScoreForIndice() {
        assertEquals("Le score ne correspond pas !", 100, q.getScoreForIndice(score), 0.0);
        assertNotEquals("Le score ne correspond pas !", 100, q.getScoreForIndice(1));
    }
}
