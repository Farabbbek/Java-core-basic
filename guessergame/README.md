# Word Guesser Game

A simple console word-guessing game in Java. You have 5 attempts to guess the secret four-letter word. After each round, you can press `p` to play again.

## Requirements
- Java 11+ (JDK)

## Project Structure
```
Java-core-basic/
└── GuesserGame/
    └── GuesserGame.java   (package GuesserGame)
```

## How to Run
From the project root (`Java-core-basic`):
```bash
cd GuesserGame
java ./GuesserGame.java
```
## Word
You can change secret word to word you want.

Here
```bash
String word = "java";
```

## How to Play
1. The game shows ASCII art and the prompt with 5 attempts.
2. Enter your guess (case-insensitive). Secret word: `java`.
3. If correct, you’re prompted to press `p` to play again.
4. If attempts run out, you see “Game over” and can press `p` to replay.
5. Any other input exits with a thank-you message.