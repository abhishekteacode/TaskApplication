package com.example.taskapplication

import android.app.ProgressDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapplication.ModelPhotos.ImageDetail
import com.project.digicard.retrofit.RetrofitRestClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhotoActivity : AppCompatActivity() {
    lateinit var showimageAdapter: ShowImageAdapter
    lateinit var recyclerView: RecyclerView

    lateinit var  context:Context
    var showData: ArrayList<ImageDetail> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
        recyclerView=findViewById(R.id.recyclerview)
        context=this@PhotoActivity
        getdataApi()
    }

    private fun getdataApi() {

        if (AppUtils.isConnectedToInternet(context)) {
            val nDialog: ProgressDialog
            nDialog = ProgressDialog(context)
            nDialog.setMessage("Loading..")
            nDialog.isIndeterminate = false
            nDialog.setCancelable(false)
            nDialog.show()
            showData.clear()
            val call: Call<List<ImageDetail>>
            call = RetrofitRestClient.getInstance()!!.showimagedata()
            call.enqueue(object : Callback<List<ImageDetail>> {
                override fun onResponse(
                    call: Call<List<ImageDetail>>,
                    response: Response<List<ImageDetail>>
                ) {
                    val showresponce:List<ImageDetail>


                    if (response.isSuccessful) {

                        showresponce = response.body()!!
                        showData.addAll(showresponce)
                        if (showData.size>0)
                        {
                            nDialog.dismiss()
                            recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
                            showimageAdapter = ShowImageAdapter(applicationContext,showData)
                            recyclerView.adapter = showimageAdapter
                        }

                    }

                }

                override fun onFailure(call: Call<List<ImageDetail>>, t: Throwable) {

                }

            })
        }
    }
}