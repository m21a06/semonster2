package semonster2;

public class Battle {
  public static void startBattle(Player p1, Player p2) {
    for (int i = 0; i < p1.list.size(); i++) {
      System.out.print("第" + i + "回戦...　");
      if (p1.list.get(i) > p2.list.get(i)) {
        System.out.println("Player1の勝利\n");
      } else if (p1.list.get(i) < p2.list.get(i)) {
        System.out.println("Player2の勝利\n");
      } else {
        System.out.println("引き分け\n");
      }
    }
  }
}
