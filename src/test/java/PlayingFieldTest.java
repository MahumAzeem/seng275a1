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
				Piece p = theField.getNextPiece();
				p.rotateRight();
				p.setX(0);
				p.moveLeft();
				//fixed
				for ( int i =0;i < Piece.PIECE_SIZE; i++ ) {
						assertTrue(p.getX() + i > 0);
				}
				// assertEquals(p.getX(),6); //Stays 6

    }
}
