package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

//GUSTAVO

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position pAux = new Position(0, 0);

		// Above
		pAux.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setRow(pAux.getRow() - 1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
		}

		// Below
		pAux.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setRow(pAux.getRow() + 1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
		}

		// Right
		pAux.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setColumn(pAux.getColumn() +1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
		}

		// Left
		pAux.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(pAux) && !getBoard().thereIsAPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
			pAux.setColumn(pAux.getColumn() - 1);
		}
		if (getBoard().positionExists(pAux) && isThereOpponentPiece(pAux)) {
			mat[pAux.getRow()][pAux.getColumn()] = true;
		}

		return mat;
	}
}
