package semonster2;

import java.util.Random;

public class semonster2 {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け

  semonster2() {
    this.rare = this.randomRarity();
    this.name = this.summonMonster();
  }

  String summonMonster() {
    // モンスター選択のランダム処理
    // Nはモンスター数なので追加した場合随時変更
    int N = 6;
    Random r = new Random();
    int mnumber = r.nextInt(N);

    // 進化処理
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント", "コメツキムシ" };
    String monstersEvolve[] = { "スライムベス", "スーパーサハギン", "スーパードラゴン", "スーパーデュラハン", "シーサーペント改", "コメツキイソベムシ" };
    if (this.rare >= 4) {
      System.out.println("おや？" + monsters[mnumber] + "の様子が・・・");
      System.out.println(monsters[mnumber] + "が" + monstersEvolve[mnumber] + "に進化した！！");
      return monstersEvolve[mnumber];
    } else {
      System.out.println("ふん、レア度たったの" + this.rare + "か…");
      return monsters[mnumber];
    }
  }

  int randomRarity() {
    // モンスターのレア度のランダム処理
    // Nは最大レア度(最小1)
    int N = 5;
    Random r = new Random();
    return r.nextInt(N) + 1;
  }

  public String getMonster() {
    return this.name;
  }

  public int getRarity() {
    return this.rare;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
