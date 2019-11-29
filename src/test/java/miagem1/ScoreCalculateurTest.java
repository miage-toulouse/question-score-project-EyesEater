package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {
    private QuestionAChoixMultiple questionAChoixMultiple;
    private ScoreCalculateur scoreCalculateur;

    @Before
    public void setUp() throws Exception {
        questionAChoixMultiple = new QuestionAChoixMultiple("q1", new ArrayList<Integer>(Arrays.asList(2, 3, 5)));
        scoreCalculateur = new ScoreCalculateur();
    }

    @Test
    public void testCalculScoreQuestionAChoixMultiple14() {
        assertEquals("Le score obtenu n'est pas le bon !", 0, this.scoreCalculateur.calculeScore(Arrays.asList(1, 4), this.questionAChoixMultiple), 0.0);
    }

    @Test
    public void testCalculScoreQuestionAChoixMultiple23() {
        assertEquals("Le score obtenu n'est pas le bon !", 200f/3, this.scoreCalculateur.calculeScore(Arrays.asList(2, 3), this.questionAChoixMultiple), 0.01);
    }

    @Test
    public void testCalculScoreQuestionAChoixMultiple235() {
        assertEquals("Le score obtenu n'est pas le bon !", 100, this.scoreCalculateur.calculeScore(Arrays.asList(2, 3, 5), this.questionAChoixMultiple), 0.01);
    }
}