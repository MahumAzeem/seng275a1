import Piece.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingFieldTest {
    private class IPieceFactory implements PieceFactory {
        public Piece createPiece() {
            return new IPiece();
        }
        public int   gameId() {
            return 0;
        }
    }
	private class NullResultCollector implements ResultCollector {
		public boolean submitGameResult (int gameId, int score, int lineCount) {
			return true;
		}
	}

    @Test
    void init() {
    }

    @Test
    void getWidth() {
    }

    @Test
    void getHeight() {
    }

    @Test
    void getCurrentPiece() {
        PieceFactory factory = new IPieceFactory();
        PlayingField theField = new PlayingField(factory, new NullResultCollector());

        assertTrue (theField.getNextPiece() instanceof IPiece );
    }

    @Test
    void getNextPiece() {
        PieceFactory factory = new IPieceFactory();
        PlayingField theField = new PlayingField(factory, new NullResultCollector());

        assertTrue (theField.getNextPiece() instanceof IPiece );
    }

    @Test
    void getContents() {
    }

    @Test
    void getLineCount() {
    }

    @Test
    void nextMove() {
    }

    @Test
    void timeout() {
    }

    @Test
    void moveDown() {
    }

    @Test
    void rotateLeft() {
    }

    @Test
    void rotateRight() {
    }

    @Test
    void moveLeft() {
    }

    @Test
    void moveRight() {
    }

    @Test
    void A1PieceTest(){
				PieceFactory factory = new IPieceFactory();
				PlayingField theField = new PlayingField(factory, new NullResultCollector());
				theField.rotateLeft();

				// move the piece to the left boundary
				theField.getCurrentPiece().setX(1);
				assertEquals(theField.getCurrentPiece().getX(),1);

				theField.moveLeft();
				// Should be 1 because the piece cannot move
				assertEquals(theField.getCurrentPiece().getX(),1);
    }

    @Test
   void A1ScoringTest(){
     PieceFactory factory = new IPieceFactory();
     PlayingField theField = new PlayingField(factory, new NullResultCollector());
     theField.getCurrentPiece().setY(17);

     theField.moveDown();
     //assertEquals(theField.getCurrentPiece().getX(),18);
     theField.moveDown();
     theField.moveDown();
     theField.moveDown();
     theField.moveDown();


     assertEquals(0,theField.getScore());
   }




}
