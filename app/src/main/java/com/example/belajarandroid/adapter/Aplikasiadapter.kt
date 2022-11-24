package com.example.belajarandroid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.belajarandroid.databinding.ItemListBinding
import com.example.belajarandroid.model.DataAplikasi

class AplikasiAdapter (private  val content: Context):RecyclerView.Adapter<AplikasiAdapter.AplikasiViewHolder>() {

    private val list = ArrayList<DataAplikasi>()

    fun setData(listParams: List<DataAplikasi>) {
        list.clear()
        list.addAll(listParams)
        notifyDataSetChanged()
    }
    inner class AplikasiViewHolder(private val binding: ItemListBinding)
        :ViewHolder(binding.root){

            fun bind(data: DataAplikasi){
                binding.image.setImageResource(data.image)
                binding.title.text = data.nama
                binding.des.text = data.des
                binding.star.text = data.rating.toString()
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AplikasiViewHolder (
        ItemListBinding.inflate(LayoutInflater.from(content),parent,false)
    )

    override fun onBindViewHolder(holder: AplikasiViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

}