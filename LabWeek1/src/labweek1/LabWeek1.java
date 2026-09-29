package labweek1;

import java.util.Scanner;

public class LabWeek1 {

    public static void main(String[] args) {
        
        int pointsA = 0;
        int pointsB = 0;
        int pointsC = 0;
        int pointsD = 0;

        int winA = 0, winB = 0, winC = 0, winD = 0;
        int drawA = 0, drawB = 0, drawC = 0, drawD = 0;
        int lossA = 0, lossB = 0, lossC = 0, lossD = 0;

        System.out.println("--- TOURNAMENT FIXTURE ---");
        System.out.println("Match 1 : Team A vs Team B");
        System.out.println("Match 2 : Team A vs Team C");
        System.out.println("Match 3 : Team A vs Team D");
        System.out.println("Match 4 : Team B vs Team C");
        System.out.println("Match 5 : Team B vs Team D");
        System.out.println("Match 6 : Team C vs Team D");
        System.out.println("--------------------------\n");

        Scanner kyb = new Scanner(System.in);

        System.out.println("Enter match scores:");
        
        System.out.println("Match 1: Team A vs Team B");
        System.out.print("Team A goals: ");
        int score1 = kyb.nextInt();
        System.out.print("Team B goals: ");
        int score2 = kyb.nextInt();

        System.out.println("Match 2: Team A vs Team C");
        System.out.print("Team A goals: ");
        int score3 = kyb.nextInt();
        System.out.print("Team C goals: ");
        int score4 = kyb.nextInt();

        System.out.println("Match 3: Team A vs Team D");
        System.out.print("Team A goals: ");
        int score5 = kyb.nextInt();
        System.out.print("Team D goals: ");
        int score6 = kyb.nextInt();

        System.out.println("Match 4: Team B vs Team C");
        System.out.print("Team B goals: ");
        int score7 = kyb.nextInt();
        System.out.print("Team C goals: ");
        int score8 = kyb.nextInt();

        System.out.println("Match 5: Team B vs Team D");
        System.out.print("Team B goals: ");
        int score9 = kyb.nextInt();
        System.out.print("Team D goals: ");
        int score10 = kyb.nextInt();

        System.out.println("Match 6: Team C vs Team D");
        System.out.print("Team C goals: ");
        int score11 = kyb.nextInt();
        System.out.print("Team D goals: ");
        int score12 = kyb.nextInt();
        System.out.println();

        System.out.println("--- ENTERED MATCH SCORES ---");
        System.out.println("Match 1 : Team A vs Team B - Team A goals : " + score1 + " Team B goals : " + score2);
        System.out.println("Match 2 : Team A vs Team C - Team A goals : " + score3 + " Team C goals : " + score4);
        System.out.println("Match 3 : Team A vs Team D - Team A goals : " + score5 + " Team D goals : " + score6);
        System.out.println("Match 4 : Team B vs Team C - Team B goals : " + score7 + " Team C goals : " + score8);
        System.out.println("Match 5 : Team B vs Team D - Team B goals : " + score9 + " Team D goals : " + score10);
        System.out.println("Match 6 : Team C vs Team D - Team C goals : " + score11 + " Team D goals : " + score12);
        System.out.println();

        if (score1 < score2) {
            pointsB += 3;
            winB++;
            lossA++;
        } else if (score1 == score2) {
            pointsA += 1;
            pointsB += 1;
            drawA++;
            drawB++;
        } else if (score1 > score2) {
            pointsA += 3;
            winA++;
            lossB++;
        }

        if (score3 < score4) {
            pointsC += 3;
            winC++;
            lossA++;
        } else if (score3 == score4) {
            pointsA += 1;
            pointsC += 1;
            drawA++;
            drawC++;
        } else if (score3 > score4) {
            pointsA += 3;
            winA++;
            lossC++;
        }

        if (score5 < score6) {
            pointsD += 3;
            winD++;
            lossA++;
        } else if (score5 == score6) {
            pointsA += 1;
            pointsD += 1;
            drawA++;
            drawD++;
        } else if (score5 > score6) {
            pointsA += 3;
            winA++;
            lossD++;
        }

        if (score7 < score8) {
            pointsC += 3;
            winC++;
            lossB++;
        } else if (score7 == score8) {
            pointsC += 1;
            pointsB += 1;
            drawC++;
            drawB++;
        } else if (score7 > score8) {
            pointsB += 3;
            winB++;
            lossC++;
        }

        if (score9 < score10) {
            pointsD += 3;
            winD++;
            lossB++;
        } else if (score9 == score10) {
            pointsD += 1;
            pointsB += 1;
            drawD++;
            drawB++;
        } else if (score9 > score10) {
            pointsB += 3;
            winB++;
            lossD++;
        }

        if (score11 < score12) {
            pointsD += 3;
            winD++;
            lossC++;
        } else if (score11 == score12) {
            pointsD += 1;
            pointsC += 1;
            drawD++;
            drawC++;
        } else if (score11 > score12) {
            pointsC += 3;
            winC++;
            lossD++;
        }

        int goalA = score1 + score3 + score5;
        int goalB = score2 + score7 + score9;
        int goalC = score4 + score8 + score11;
        int goalD = score6 + score10 + score12;

        int againstA = score2 + score4 + score6;
        int againstB = score1 + score8 + score10;
        int againstC = score3 + score7 + score12;
        int againstD = score5 + score9 + score11;

        int gdA = goalA - againstA;
        int gdB = goalB - againstB;
        int gdC = goalC - againstC;
        int gdD = goalD - againstD;

        System.out.println("Team A");
        System.out.println("Matches played : 3");
        System.out.println("Wins : " + winA);
        System.out.println("Draws : " + drawA);
        System.out.println("Losses : " + lossA);
        System.out.println("Total points : " + pointsA);
        System.out.println("Goal difference : " + gdA);
        System.out.println();

        System.out.println("Team B");
        System.out.println("Matches played : 3");
        System.out.println("Wins : " + winB);
        System.out.println("Draws : " + drawB);
        System.out.println("Losses : " + lossB);
        System.out.println("Total points : " + pointsB);
        System.out.println("Goal difference : " + gdB);
        System.out.println();

        System.out.println("Team C");
        System.out.println("Matches played : 3");
        System.out.println("Wins : " + winC);
        System.out.println("Draws : " + drawC);
        System.out.println("Losses : " + lossC);
        System.out.println("Total points : " + pointsC);
        System.out.println("Goal difference : " + gdC);
        System.out.println();

        System.out.println("Team D");
        System.out.println("Matches played : 3");
        System.out.println("Wins : " + winD);
        System.out.println("Draws : " + drawD);
        System.out.println("Losses : " + lossD);
        System.out.println("Total points : " + pointsD);
        System.out.println("Goal difference : " + gdD);
        System.out.println();

        String champion = "Team A";
        int maxPoints = pointsA;
        int maxGD = gdA;

        if (pointsB > maxPoints || (pointsB == maxPoints && gdB > maxGD)) {
            champion = "Team B";
            maxPoints = pointsB;
            maxGD = gdB;
        }

        if (pointsC > maxPoints || (pointsC == maxPoints && gdC > maxGD)) {
            champion = "Team C";
            maxPoints = pointsC;
            maxGD = gdC;
        }

        if (pointsD > maxPoints || (pointsD == maxPoints && gdD > maxGD)) {
            champion = "Team D";
            maxPoints = pointsD;
            maxGD = gdD;
        }

        System.out.println("Tournament Champion: " + champion);

        kyb.close();

    }
    
}
