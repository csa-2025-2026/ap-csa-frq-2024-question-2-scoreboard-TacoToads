/*

# Answer close reading 1 questions here


# Answer close reading 2 questions here

*/

// Write the class below

public class Scoreboard
{
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean isActive;

    public Scoreboard(String _team1, String _team2)
    {
        team1 = _team1;
        team2 = _team2;
        score1 = 0;
        score2 = 0;
        isActive = true;
    }

    public void recordPlay(int _score)
    {
        if(isActive)
        {
            score1 += _score;
            isActive = false;
        }
        else
        {
            score2 += _score;
            isActive = true;
        }

    }

    public String getScore()
    {
        if(isActive)
        {
            return score1 + "-" + score2 + "-" + team1;
        }
        else
        {
            return score1 + "-" + score2 + "-" + team2;
        }

       // String output = score1 + "-" + score2 + "-";
    }



}