package com.example.taskapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapplication.ModelPhotos.ImageDetail
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class ShowImageAdapter(val context: Context, var imgedata: List<ImageDetail>) : RecyclerView.Adapter<ShowImageAdapter.ViewHolder>()  {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        if (imgedata[position].getUrl()!= null) {
            Picasso.get()
                .load(imgedata[position].getThumbnailUrl())
                .into(holder.image, object : Callback {
                    override fun onSuccess() {
                        holder.progress.setVisibility(View.GONE)
                    }

                    override fun onError(e: Exception?) {
                        holder.image.setImageResource(R.drawable.ic_baseline_image_24);
                    }
                })
        } else {
            holder.image.setImageResource(R.drawable.ic_baseline_image_24);
        }



        holder.image.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, FullImageActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("id_value", imgedata[position].getUrl())
            context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return imgedata.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image: ImageView
        var progress:ProgressBar


        init {
            image = itemView.findViewById<View>(R.id.image) as ImageView
            progress = itemView.findViewById<View>(R.id.preogess) as ProgressBar

        }
    }

}
