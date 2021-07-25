package semonster2;

public class semonster2 {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け

  semonster2(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    String monstersEvolve[] = { "スライムベス", "スーパーサハギン", "スーパードラゴン", "スーパーデュラハン", "シーサーペント改" };

    if (this.rare <= 3) {
      System.out.print("おや？" + monsters[mnumber] + "の様子が・・・");
      System.out.print(monsters[mnumber] + "が" + monsters[mnumber] + "に進化した！！");
      return monstersEvolve[mnumber];
    } else {
      return monsters[mnumber];
    }
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
