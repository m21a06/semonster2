package semonster2;

import java.util.Random;

public class semonster2 {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け

  semonster2() {
    this.name = this.summonMonster();
    this.rare = this.randomRarity();
  }

  String summonMonster() {
    // モンスター選択のランダム処理
    // Nはモンスター数なので追加した場合随時変更
    int N = 5;
    Random r = new Random();
    int mnumber = r.nextInt(N);

    // 進化処理。現時点では特定のレア度を超えた場合進化処理。
    int evolve_line = 3;
    if (this.rare <= evolve_line) {
      String monsters[] = { "スライムベス", "スーパーサハギン", "スーパードラゴン", "スーパーデュラハン", "シーサーペント改" };
      return monsters[mnumber];

    } else {
      String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
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

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
