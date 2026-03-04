問題文
---
英小文字からなる文字列Sが与えられます。Sの中で出現回数が最も多い文字をすべて取り除き、残った文字を元の順序を保ったまま連結して出力してください。

なお、出現回数が最大の文字が複数種類ある場合は、そのすべてを取り除いてください。

制約
---
* 1≤∣S∣≤100
* Sは英小文字からなる文字列である

入力
---
入力は以下の形式で標準入力から与えられる。
```
S
```

出力
---
答えを出力せよ。

入力例 1
---
```
mississippi
```

出力例 1
---
```
mpp
```

mississippi に最も多く出現する文字は s と i でともに4 回出現します。s と i をすべて取り除いた文字列は mpp となります。

入力例 2
---
```
atcoder
```

出力例 2
---
```

```

入力例 3
---
```
beginner
```

出力例 3
---
```
bgir
```

<pre>
JavaScript
const fs = require('fs');

/**
 * 与えられた文字列の中で最も頻出する文字をすべて削除する関数
 */
function solution() {
  // 標準入力からデータを読み込み、前後の空白を削除
  const input = fs.readFileSync(0, 'utf8').trim();
  
  // 入力が空の場合は終了
  if (!input) return;
  
  // 文字列を配列に変換
  const charArray = input.split('');
  
  // 各文字の出現回数を記録するためのMapオブジェクト
  const counts = new Map();

  // 1. 各文字の出現回数をカウント
  for (const char of charArray) {
    // 既存の値があればそれに+1、なければ0に+1
    counts.set(char, (counts.get(char) || 0) + 1);
  }

  // 2. 出現回数の最大値を取得
  // Mapの値を配列として展開し、その中から最大値を求める
  const maxFrequancy = Math.max(...counts.values());

  // 3. 最大頻度を持つ文字を除外して再結合
  const result = charArray
    .filter(char => counts.get(char) !== maxFrequancy) // 最大頻度ではない文字だけ残す
    .join(''); // 配列を文字列に変換

  // 結果を出力
  // Output the final result
  console.log(result);
}

// 関数を実行
solution();
</pre>
