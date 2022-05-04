package com.example.taskapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class FullImageActivity : AppCompatActivity() {
    lateinit var progress:ProgressBar
    lateinit var image:ImageView
    lateinit var urldetail:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_image)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            urldetail= bundle.get("id_value") as String
        }
        progress=findViewById(R.id.progress)
        image=findViewById(R.id.imageView)
        Picasso.get()
            .load(urldetail)
            .into(image, object : Callback {
                override fun onSuccess() {
                    progress.setVisibility(View.GONE)
                }

                override fun onError(e: Exception?) {
                    image.setImageResource(R.drawable.ic_baseline_image_24);
                }
            })
    }
}