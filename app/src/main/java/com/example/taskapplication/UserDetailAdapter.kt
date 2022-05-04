package com.example.taskapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapplication.ModelPhotos.ImageDetail
import com.example.taskapplication.ModelUser.UserDetail

class UserDetailAdapter(val context: Context, var userdetail: List<UserDetail>) : RecyclerView.Adapter<UserDetailAdapter.ViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.detail_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (userdetail[position].getId() != null) {
            holder.id.text = userdetail[position].getId().toString()
        } else {
            holder.id.text = "Null"
        }


        if (userdetail[position].getUsername() != null) {
            holder.userid.text = userdetail[position].getUsername().toString()
        } else {
            holder.userid.text = "Null"
        }
        holder.main_lyt.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, EmptyUserActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("id_value1", userdetail[position].getId().toString())
            intent.putExtra("id_value2", userdetail[position].getName())
            intent.putExtra("id_value3", userdetail[position].getUsername())
            intent.putExtra("id_value4", userdetail[position].getEmail())
            intent.putExtra("id_value5", userdetail[position].getAddress()?.getSuite()+" "+userdetail[position].getAddress()?.getStreet())
            intent.putExtra("id_value6",userdetail[position].getAddress()?.getCity())
            intent.putExtra("id_value7", userdetail[position].getAddress()?.getZipcode())
            intent.putExtra("id_value8", userdetail[position].getPhone())
            intent.putExtra("id_value9",userdetail[position].getWebsite() )
            intent.putExtra("id_value10",userdetail[position].getCompany()?.getName())
            intent.putExtra("id_value11",userdetail[position].getCompany()?.getCatchPhrase())
            intent.putExtra("id_value12",userdetail[position].getCompany()?.getBs())
            context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
return userdetail.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var id: TextView
        var userid: TextView
        var main_lyt: CardView


        init {
            id = itemView.findViewById<View>(R.id.id) as TextView
            userid = itemView.findViewById<View>(R.id.username) as TextView
            main_lyt = itemView.findViewById<View>(R.id.main_lyt) as CardView

        }
    }
}