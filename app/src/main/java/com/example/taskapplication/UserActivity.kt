package com.example.taskapplication

import android.app.ProgressDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapplication.ModelPhotos.ImageDetail
import com.example.taskapplication.ModelUser.UserDetail
import com.project.digicard.retrofit.RetrofitRestClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserActivity : AppCompatActivity() {
    lateinit var userdetailAdapter: UserDetailAdapter
    lateinit var recyclerView: RecyclerView

    lateinit var  context: Context
    var showData: ArrayList<UserDetail> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        recyclerView=findViewById(R.id.user_recycler);
        context=this@UserActivity
        loadapi()
    }

    private fun loadapi() {
        if (AppUtils.isConnectedToInternet(context)) {
            val nDialog: ProgressDialog
            nDialog = ProgressDialog(context)
            nDialog.setMessage("Loading..")
            nDialog.isIndeterminate = false
            nDialog.setCancelable(false)
            nDialog.show()
            showData.clear()
            val call: Call<List<UserDetail>>
            call = RetrofitRestClient.getInstance()!!.showdata()
            call.enqueue(object : Callback<List<UserDetail>> {
                override fun onResponse(
                    call: Call<List<UserDetail>>,
                    response: Response<List<UserDetail>>
                ) {
                    val showresponce:List<UserDetail>
                    nDialog.dismiss()
                    if (response.isSuccessful) {
                        showresponce = response.body()!!
                        showData.addAll(showresponce)
                        if (showData.size>0)
                        {

                            val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                            recyclerView.layoutManager = linearLayoutManager
                            userdetailAdapter = UserDetailAdapter( applicationContext,showData)
                            recyclerView.adapter = userdetailAdapter
                        }

                    }
                }

                override fun onFailure(call: Call<List<UserDetail>>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
        }
    }
}