package app.doggy.skillgem_recyclerview

import android.content.Context
import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Dataを直接RecyclerViewに渡すことはできない。
//Adapterは、DataとRecyclerViewを紐付ける。
class RecyclerViewAdapter(private val context: Context): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    //RecyclerViewに表示するリストの宣言。
    val items: MutableList<Data> = mutableListOf()

    //ViewHolderをインスタンス化する。
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_data_cell, parent, false)
        return ViewHolder(view)
    }

    //リストの要素数を返す。
    override fun getItemCount(): Int {
        return items.size
    }

    //itemsのposition番目の要素をViewに表示する。
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.imageView.setImageResource(item.imageResource)
        holder.textView1.setText(item.text1)
        holder.textView2.setText(item.text2)
    }

    //RecyclerViewにデータを表示する。
    fun addAll(items: List<Data>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    //まずViewHolderクラスを作成する。
    //ViewHolderクラスは、Viewを保持するクラスであり、Adapterを使うときに必要となる。
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textView1: TextView = view.findViewById(R.id.textView1)
        val textView2: TextView = view.findViewById(R.id.textView2)
    }

}