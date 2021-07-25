package semonster2;

import java.util.ArrayList;

public class player {
  public String name; // プレイヤー名
  ArrayList<semonster2> list = new ArrayList<>(); // デッキ

  // 名前の指定なし
  player() {
    this.name = "hoge";
    for (int i = 0; i < 5; i++) {
      list.add(new semonster2());
    }
  }

  // 名前の指定あり
  player(String name) {
    this.name = name;
    for (int i = 0; i < 5; i++) {
      list.add(new semonster2());
    }
  }

  @Override
  public String toString() {
    String info = "";
    info += "Deck:" + this.name;
    for (int i = 0; i < 5; i++) {
      info += this.list.get(i).toString();
    }
    return info;
  }
}
