package semonster2;

public class Battle {
  public static void startBattle(player p1, player p2) {
    for (int i = 0; i < p1.list.size(); i++) {
      System.out.println("第" + (i + 1) + "回戦...　");

      // 対戦するモンスター名とレアリティの表示
      System.out.println(p1.list.get(i).getMonster() + "[" + p1.list.get(i).getRarity() + "]" + " VS "
          + p2.list.get(i).getMonster() + "[" + p2.list.get(i).getRarity() + "]");

      // 結果発表
      if (p1.list.get(i).getRarity() > p2.list.get(i).getRarity()) {
        System.out.println(p1.name + "の勝利\n");
      } else if (p1.list.get(i).getRarity() < p2.list.get(i).getRarity()) {
        System.out.println(p2.name + "の勝利\n");
      } else {
        System.out.println("引き分け\n");
      }

      System.out.println();
    }
    return;
  }
}
