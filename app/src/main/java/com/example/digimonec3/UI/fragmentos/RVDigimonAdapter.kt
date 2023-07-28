package com.example.digimonec3.UI.fragmentos


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.digimonec3.R
import com.example.digimonec3.databinding.ItemDigimonBinding
import com.example.digimonec3.model.Digimons

class RVDigimonAdapter(var  digimons: List<Digimons>): RecyclerView.Adapter<DigimonsVH> (){
    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonsVH {
        val binding = ItemDigimonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  DigimonsVH(binding)*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonsVH {
      val binding = ItemDigimonBinding.inflate(LayoutInflater.from(parent.context), parent , false)
        return DigimonsVH(binding )
    }

    override fun getItemCount(): Int = digimons.size


    override fun onBindViewHolder(holder: DigimonsVH, position: Int) {
        holder.bind(digimons[position])
    }
}
   /*
   (private val  digimons: List<Digimons>): RecyclerView.Adapter<DigimonsVH> (){
    override fun getItemCount(): Int = digimons.size

      val binding= ItemDigimonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DigimonsVH(binding)

    override fun onBindViewHolder(holder: DigimonsVH, position: Int) {
        holder.bind(digimons[position])
    }*/


class  DigimonsVH(private val binding: ItemDigimonBinding): RecyclerView.ViewHolder(binding.root) {

    fun  bind(digimons: Digimons) {
        binding.txtDigName.text = digimons.name
        binding.txtDigCod.text = digimons.codigo
        binding.txtDigPrice.text = "$ ${digimons.precio}"
        if(digimons.imgURL.isNotEmpty()) {
            binding.imageImgdigimon.load(digimons.imgURL)
        } else {
            binding.imageImgdigimon.setImageResource(R.drawable.otomamon)
        }
        if(digimons.isFavorite){
            binding.btnFavorite.setImageResource(R.drawable.ic_favorite_rellenado)
        }else {
            binding.btnFavorite.setImageResource(R.drawable.ic_favorito)
        }



    }  }