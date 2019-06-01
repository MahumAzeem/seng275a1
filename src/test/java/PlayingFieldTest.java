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
				// Try moving into the left boundary
				theField.moveLeft();
				// Should be 1 because the piece cannot move
				assertEquals(theField.getCurrentPiece().getX(),1);
    }

		@Test
    void A1PieceTestRight(){
				PieceFactory factory = new IPieceFactory();
				PlayingField theField = new PlayingField(factory, new NullResultCollector());
				// move the piece to the right boundary
				theField.getCurrentPiece().setX(9);
				// Try moving into the right boundary
				theField.moveRight();
				// Should be 9 because the piece cannot move
				assertEquals(theField.getCurrentPiece().getX(),9);
    }

		@Test
		void A1PieceTestDown(){
				PieceFactory factory = new IPieceFactory();
				PlayingField theField = new PlayingField(factory, new NullResultCollector());
				// move the piece to the bottom boundary
				theField.getCurrentPiece().setY(20);
				// Try moving into the bottom boundary
				theField.moveDown();
				// Should be 9 because the piece cannot move
				assertEquals(theField.getCurrentPiece().getY(),20);
		}


    @Test
   void A1ScoringTest(){
     // move down with space three times, should give softscore of 3 points

     PieceFactory factory = new IPieceFactory();
     PlayingField theField = new PlayingField(factory, new NullResultCollector());
     theField.getCurrentPiece().setY(17);

     theField.moveDown();
     theField.moveDown();
     theField.moveDown();
     theField.timeout();

     assertEquals(3,theField.getScore());

   }


    @Test
   void A1ScoringTest_move_right (){
     // move down two times then do moveright (resets softscore) then move moveDown
     // softscore=1


     PieceFactory factory = new IPieceFactory();
     PlayingField theField = new PlayingField(factory, new NullResultCollector());
     theField.getCurrentPiece().setY(17);
     theField.moveDown();
     theField.moveDown();
     theField.moveRight();
     theField.moveDown();
     theField.timeout();

     assertEquals(1,theField.getScore());


   }


   @Test
  void A1ScoringTest_move_left (){
    // move down two times then do moveright (resets softscore) then move moveDown
    // softscore=1

    PieceFactory factory = new IPieceFactory();
    PlayingField theField = new PlayingField(factory, new NullResultCollector());
    theField.getCurrentPiece().setY(17);

    theField.moveDown();
    theField.moveDown();
    theField.moveLeft();
    theField.moveDown();
    theField.timeout();

    assertEquals(1,theField.getScore());

  }

  @Test
 void A1ScoringTest_rotate_right (){
   // move down two times then do rotateRight (resets softscore) then move moveDown
   // softscore=1

   PieceFactory factory = new IPieceFactory();
   PlayingField theField = new PlayingField(factory, new NullResultCollector());
   theField.getCurrentPiece().setY(17);

   theField.moveDown();
   theField.moveDown();
   theField.rotateRight();
   theField.moveDown();
   theField.timeout();

   assertEquals(1,theField.getScore());

 }

 @Test
void A1ScoringTest_rotate_left (){

  // move down two times then do rotateLeft (resets softscore) then move moveDown
  // softscore=1

  PieceFactory factory = new IPieceFactory();
  PlayingField theField = new PlayingField(factory, new NullResultCollector());
  theField.getCurrentPiece().setY(17);

  theField.moveDown();
  theField.moveDown();
  theField.rotateLeft();
  theField.moveDown();
  theField.timeout();

  assertEquals(1,theField.getScore());

}



}
