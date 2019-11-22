package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {
    private QuestionAChoixMultiple q;
    private QuestionAChoixExclusif qe;
    private ScoreCalculateur calculateur;
    private List<Integer> score;
    private List<Integer> falseScore;
    private List<Integer> scoreQe;
    private List<Integer> falseScoreQe;
    private String enoncer;

    @Before
    public void setUp() throws Exception {
        this.score = new ArrayList<>();
        this.score.add(1);
        this.score.add(4);
        this.score.add(8);
        this.score.add(14);

        this.falseScore = new ArrayList<>();
        this.falseScore.add(3);
        this.falseScore.add(5);
        this.falseScore.add(10);
        this.falseScore.add(16);

        this.scoreQe = new ArrayList<>();
        this.scoreQe.add(14);

        this.falseScoreQe = new ArrayList<>();
        this.falseScoreQe.add(30);

        this.enoncer = "Quel est la taille moyenne d'une banane ?";

        this.q = new QuestionAChoixMultiple(enoncer, score);
        this.calculateur = new ScoreCalculateur();

        this.qe = new QuestionAChoixExclusif(enoncer, 14);
    }

    @Test
    public void TestCalculeScoreQuestionAChoixMultipleBonneReponse() {
        assertEquals("Le score ne correspond pas !", 100, calculateur.calculeScore(score, q), 0.0);
    }

    @Test
    public void TestCalculeScoreQuestionAChoixMultipleMauvaiseReponse() {
        assertEquals("Le score ne correspond pas !", 0, calculateur.calculeScore(falseScore, q), 0.0);
    }

    @Test
    public void TestCalculeScoreQuestionAChoixExclusifBonneReponse() {
        assertEquals("Le score ne correspond pas !", 100, calculateur.calculeScore(scoreQe, qe), 0.0);
    }

    @Test
    public void TestCalculeScoreQuestionAChoixExclusifMauvaiseReponse() {
        assertEquals("Le score ne correspond pas !", 0, calculateur.calculeScore(falseScoreQe, qe), 0.0);
    }

    @Test
    public void testCalculScoreQuestionAChoixMultipleGetEnonce() {
        assertEquals("L'énoncer n'est pas le bon !", this.enoncer, q.getEnonce());
    }

    @Test
    public void testCalculScoreQuestionAChoixExclusifGetEnonce() {
        assertEquals("L'énoncer n'est pas le bon !", this.enoncer, qe.getEnonce());
    }
}