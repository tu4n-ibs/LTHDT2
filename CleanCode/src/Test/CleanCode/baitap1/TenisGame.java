package CleanCode.baitap1;

public class TenisGame {
    public static String getScore(String playerName1, String playerName2, int scorePlayer1, int socrePlayer2) {
        String score = "";
        int tempScore ;
        if (scorePlayer1 == socrePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (scorePlayer1 >= 4 || socrePlayer2 >= 4) {
            int minusResult = scorePlayer1 - socrePlayer2;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scorePlayer1;
                } else {
                    score += "-";
                    tempScore = socrePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
