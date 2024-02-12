# Chess System Project

This project is part of the Object-Oriented Programming course with Java, taught by Prof. Dr. Nelio Alves. 
The goal of this project is to apply the knowledge learned in the course to build a Chess System.

## Project Objectives:
1. Apply learned OOP concepts to build a functional chess game.
2. Implement key chess rules and logic.
3. Design a user-friendly interface for interaction.

## System Design
The system design can be found at [System Design](https://github.com/acenelio/chess-system-design/blob/master/chess-system-design.png).

## Main Classes Implemented
1. **Board**: Represents the chessboard and contains methods for placing and retrieving pieces.
2. **Piece**: Base class for chess pieces.
3. **ChessMatch**: Manages the chess match, including player turns and moves.
4. **ChessException**: Handling exceptions for invalid moves and other errors.
5. **UI**: Provides text-based interface to display the board, capture user input, and print messages.

## Implemented Features
1. Board representation with piece positions.
2. Piece movement based on their individual rules.
3. Handling captured pieces.
4. Check and checkmate logic.
5. Piece move count tracking.
6. Special moves: castling, en passant, and promotion.

## OOP Concepts Utilized:
1. **Encapsulation**: Hiding internal data and exposing necessary methods.
2. **Inheritance**: Defining common behavior in abstract classes and specializing in subclasses.
3. **Polymorphism**: Overriding methods for specific behaviors in subclasses.
4. **Data structures**: Using lists and matrices to represent board and pieces.
5. **Exceptions**: Handling invalid moves and errors gracefully.

## How to Run
To run the Chess System project, follow these steps:
1. Clone the repository.
2. Compile the Java files.
3. Run the main program.
```
.../Chess_System/bin$ java application/Program
```

Feel free to explore the code and contribute to the project!

Enjoy playing chess! 🎲♟️
