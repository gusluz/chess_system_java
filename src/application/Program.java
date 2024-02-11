package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> capturedList = new ArrayList<ChessPiece>();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch, capturedList);
				System.out.print("\nSource: ");
				ChessPosition source = UI.readChessPosition(scanner);
				
				boolean[][] matPossibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), matPossibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(scanner);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				
				if(capturedPiece != null) {
					capturedList.add(capturedPiece);
				}
				
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		}
		
	}

}
