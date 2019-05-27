import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Piece.*;

class PieceTest {

    static Piece p;

    @BeforeAll
     static void createPiece () {
        p = new IPiece();
        p.setX(22);
        p.setY(12);
    }

    @Test
    void getTotalPieces() {
        assertEquals(Piece.getTotalPieces(), 7);
    }

    @Test
    void getX() {
        Piece p = new IPiece();
        p.setX(3);
        assertEquals(p.getX(), 3);

    }

    @Test
    void getY() {
        Piece p = new IPiece();
        p.setY(5);
        assertEquals(p.getY(), 5);
    }

    @Test
    void moveLeft() {
        Piece p = new IPiece();
        p.setX(3);

        int x = p.getX();
        p.moveLeft();
        assertEquals (p.getX(), x - 1);
    }

    @Test
    void moveRight() {
        Piece p = new IPiece();
        p.setX(3);

        int x = p.getX();
        p.moveRight();
        assertEquals (p.getX(), x + 1);
    }

    @Test
    void moveDown() {
        Piece p = new IPiece();
        p.setY(3);

        int y = p.getY();
        p.moveDown();
        assertEquals (p.getY(), y + 1);
    }

    @Test
    void moveUp() {
        Piece p = new IPiece();
        p.setY(3);

        int y = p.getY();
        p.moveUp();
        assertEquals (p.getY(), y - 1);
    }

    @Test
    void getType() {
        Piece p;
        p = new IPiece();
        assertEquals(p.getType(), Piece.PieceType.PIECE_I);
        p = new TPiece();
        assertEquals(p.getType(), Piece.PieceType.PIECE_T);
        p = new LPiece();
        assertEquals(p.getType(), Piece.PieceType.PIECE_L);
        p = new JPiece();
        assertEquals(p.getType(), Piece.PieceType.PIECE_J);
        p = new OPiece();
        assertEquals(p.getType(), Piece.PieceType.PIECE_O);
        p = new SPiece();
        assertEquals(p.getType(), Piece.PieceType.PIECE_S);
        p = new ZPiece();
        assertEquals(p.getType(), Piece.PieceType.PIECE_Z);
    }

    @Test
    void testMoveThreeTimes() {
        Piece p = new IPiece();
        p.setY(4);
        p.moveDown();
        p.moveDown();
        p.moveDown();
        // 4 + 3 = 7
        assertEquals (p.getY(), 7);
    }


		@Test
		void originalLPosition() {
				p = new LPiece();
				// original Position
				assertEquals(p.isCovering(2,0),true);
				assertEquals(p.isCovering(0,1),true);
				assertEquals(p.isCovering(1,1),true);
				assertEquals(p.isCovering(2,1),true);
		}

    @Test
    void rotateLeft() {
				p = new LPiece();
				p.rotateLeft();
				// after one position
				assertEquals(p.isCovering(1,0),true);
				assertEquals(p.isCovering(1,1),true);
				assertEquals(p.isCovering(1,2),true);
				assertEquals(p.isCovering(2,2),true);
    }

    @Test
    void rotateRight() {

    }

    @Test
    void isCovering() {
    }
}
