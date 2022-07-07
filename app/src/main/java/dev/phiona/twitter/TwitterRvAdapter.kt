package dev.phiona.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweeterRvAdapter(var twitterList:List<Twitter>): RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter=twitterList.get(position)
        holder.tvName.text=currentTwitter.name
        holder.tvUserName.text=currentTwitter.username
        holder.tvWord.text=currentTwitter.word
        holder.tvRetweet.text=currentTwitter.retweet
        holder.tvLikes.text=currentTwitter.likes
//        holder.tvHour.text=currentTwitter.time
    }

    override fun getItemCount(): Int {
        return  twitterList.size
    }
}
class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvUserName=itemView.findViewById<TextView>(R.id.tvUserName)
    var tvWord=itemView.findViewById<TextView>(R.id.tvWord)
    var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvLikes=itemView.findViewById<TextView>(R.id.tvLikes)
    var imgAvatar=itemView.findViewById<ImageView>(R.id.imgAvatar)
    var imgComment=itemView.findViewById<ImageView>(R.id.imgComment)
    var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgLike=itemView.findViewById<ImageView>(R.id.imgLike)
    var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)

}
