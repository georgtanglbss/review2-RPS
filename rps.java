import java.util.Scanner;
class rps{
    static Scanner sc = new Scanner(System.in);
    static final int Rock = 1;
    static final int Paper = 2;
    static final int Scissors = 3;
    static int human,pc;
    static int wins,losses,ties = 0;

    public static void main(String[] args){
        System.out.println("RPS 1.0");
        System.out.println("**********************");
        System.out.println("Good luck, human . . .");
        System.out.println(" ");

        String ans  = "Y";

        while(!ans.equals ("N")){
            System.out.println("What do you throw? [1]Rock,[2]Paper,[3]Scissors?");
            human = sc.nextInt();
            pc = (int) (Math.random() * 3 + 1);
            if (human == Rock) {
                System.out.print("You threw Rock! ");
            }else if (human == Paper){ 
                System.out.print("You threw Paper! ");
            }else if (human == Scissors){ 
                System.out.print("You threw Scissors! ");
            }

            if (pc == Rock){     
                System.out.println("I threw Rock!");
            }else if (pc == Paper){ 
                System.out.println("I threw Paper!");
            }else if (pc == Scissors) {
                System.out.println("I threw Scissors!");
            }

            if (human == Rock && pc == Scissors || human == Paper && pc == Rock || human == Scissors && pc == Paper) {
                System.out.println("Whaaa?? ... You beat me? RAGE!");
                wins++;
            } else if (human == pc) {
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                ties++;
            } else {
                System.out.println("I win! You are not a challenge for me ...");
                losses++;
            }

            System.out.println("");
            System.out.println("Play again? [Y,N]");
            ans = sc.next();

        }
        if(ans.equals("N")){
            System.out.println("Good Game! Thanks for playing.");
            System.out.println("**********************");
            System.out.println("Wins:   " + wins);
            System.out.println("Losses: " + losses);
            System.out.println("Ties:   " + ties);
        }
    }
}