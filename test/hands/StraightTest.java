package hands;

import constants.Type;
import constants.Value;
import entities.Card;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StraightTest {

    private AbstractHand h1, h2;

    private static ArrayList<Card> straight1, straight2;

    @BeforeClass
    public static void init() {
        straight1 = new ArrayList<>();
        straight1.add(new Card(Value.NINE, Type.CLUB));
        straight1.add(new Card(Value.TEN, Type.CLUB));
        straight1.add(new Card(Value.JACK, Type.HEART));
        straight1.add(new Card(Value.QUEEN, Type.CLUB));
        straight1.add(new Card(Value.KING, Type.CLUB));

        straight2 = new ArrayList<>();
        straight2.add(new Card(Value.EIGHT, Type.CLUB));
        straight2.add(new Card(Value.NINE, Type.CLUB));
        straight2.add(new Card(Value.TEN, Type.HEART));
        straight2.add(new Card(Value.JACK, Type.CLUB));
        straight2.add(new Card(Value.QUEEN, Type.CLUB));

        assertEquals(straight1.size(), 5);
        assertEquals(straight2.size(), 5);
    }

    /**
     *
     */
    @Test
    public void testEquals() {
        h1 = new Straight(straight1);
        h2 = new Straight(straight1);

        assertEquals(h1.compareTo(h2), 0);
    }

    /**
     *
     */
    @Test
    public void testDifferent() {
        h1 = new Straight(straight1);
        h2 = new Straight(straight2);

        assertTrue(h1.compareTo(h2) > 0);
    }
}