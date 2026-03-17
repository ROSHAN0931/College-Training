import java.util.Scanner;

class Cricket {

    private String name;
    private int totalRuns;
    private int matchesPlayed;

    public String getName() {
        return name;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalRuns(int totalRuns) {
        if (totalRuns > 0)
            this.totalRuns = totalRuns;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        if (matchesPlayed > 0)
            this.matchesPlayed = matchesPlayed;
    }
}

public class t33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cricket player = new Cricket();

        System.out.println("Enter Player Name:");
        String name = sc.nextLine();
        player.setName(name);

        System.out.println("Enter Total Runs:");
        int runs = sc.nextInt();
        player.setTotalRuns(runs);

        System.out.println("Enter Matches Played:");
        int matches = sc.nextInt();
        player.setMatchesPlayed(matches);

        System.out.println("\nCricket Player Details:");
        System.out.println("Name: " + player.getName());
        System.out.println("Total Runs: " + player.getTotalRuns());
        System.out.println("Matches Played: " + player.getMatchesPlayed());

        sc.close();
    }
}
