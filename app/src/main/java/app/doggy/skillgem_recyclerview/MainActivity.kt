package app.doggy.skillgem_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Dataクラスの配列を作成する。
    //リストのセル毎にデータを一つずつ入れ、リスト表示を実現する。
    val data: List<Data> = listOf(
        Data(R.drawable.man, "一般的なサラリーマン", "休日は家でゴロゴロして過ごす。"),
        Data(R.drawable.woman, "お団子あたまのキャリアウーマン", "お堅く見えても実は乙女。"),
        Data(R.drawable.boss, "上司", "家庭内カーストはペット以下。")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapterをインスタンス化する。
        val adapter = RecyclerViewAdapter(this)

        //RecyclerViewのレイアウトを決める。
        recyclerView.layoutManager = LinearLayoutManager(this) //縦横表示
        //recyclerView.layoutManager = GridLayoutManager(baseContext,2) //グリッド表示

        //RecyclerViewにadapterを渡す。
        recyclerView.adapter = adapter

        //RecyclerViewにデータを表示する。
        adapter.addAll(data)
    }
}