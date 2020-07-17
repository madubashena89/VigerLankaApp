package top.stores.vigerlankaapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import top.stores.vigerlankaapp.R

class HomeAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val kode = arrayOf("d116df5",
        "36ffc75", "f5cfe78", "5b87628",
        "db8d14e", "9913dc4", "e120f96",
        "466251b")

    private val kategori = arrayOf("Kekayaan", "Teknologi",
        "Keluarga", "Bisnis",
        "Keluarga", "Hutang",
        "Teknologi", "Pidana")

    private val isi = arrayOf("pertanyaan 9",
        "pertanyaan 11", "pertanyaan 17", "test forum",
        "pertanyaan 12", "pertanyaan 18", "pertanyaan 20",
        "pertanyaan 21")



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_card_view, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvHomeItem: TextView
        var imageVSpcie: ImageView


        init {
            tvHomeItem = itemView.findViewById(R.id.tv_home_spice_name)
            imageVSpcie = itemView.findViewById(R.id.home_spice_image)

            itemView.setOnClickListener {
                var position: Int = getAdapterPosition()
                val context = itemView.context
                val intent = Intent(context, DetailPertanyaan::class.java).apply {
                    putExtra("NUMBER", position)
                    putExtra("CODE", itemKode.text)
                    putExtra("CATEGORY", itemKategori.text)
                    putExtra("CONTENT", itemIsi.text)
                }
                context.startActivity(intent)
            }
        }
    }
}