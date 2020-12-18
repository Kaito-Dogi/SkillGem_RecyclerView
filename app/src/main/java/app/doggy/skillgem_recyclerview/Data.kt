package app.doggy.skillgem_recyclerview

//複数の異なるデータ型の変数を一つにまとめる。
//RecyclerViewに表示させる内容に応じてカスタマイズする。
data class Data(val imageResource: Int,
                val text1: String,
                val text2: String) {}