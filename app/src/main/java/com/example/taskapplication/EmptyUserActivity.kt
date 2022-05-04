package com.example.taskapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class EmptyUserActivity : AppCompatActivity() {
    lateinit var id: TextView
    lateinit var name: TextView
    lateinit var Username: TextView
    lateinit var email: TextView
    lateinit var address: TextView
    lateinit var city: TextView
    lateinit var zipcode: TextView
    lateinit var phone: TextView
    lateinit var website: TextView
    lateinit var company: TextView
    lateinit var catchPhrase: TextView
    lateinit var bs: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty_user)
        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        Username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        address=findViewById(R.id.address);
        city=findViewById(R.id.city);
        zipcode=findViewById(R.id.zipcode);
        phone=findViewById(R.id.phone);
        website=findViewById(R.id.website);
        company=findViewById(R.id.company);
        catchPhrase=findViewById(R.id.catchPhrase);
        bs=findViewById(R.id.bs);
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            Log.e("showdata",""+bundle.get("id_value1") as String)
            id.text= bundle.get("id_value1") as String
            name.text= bundle.get("id_value2") as String
            Username.text= bundle.get("id_value3") as String
            email.text= bundle.get("id_value4") as String
            address.text= bundle.get("id_value5") as String
            city.text= bundle.get("id_value6") as String
            zipcode.text= bundle.get("id_value7") as String
            phone.text= bundle.get("id_value8") as String
            website.text= bundle.get("id_value9") as String
            company.text= bundle.get("id_value10") as String
            catchPhrase.text= bundle.get("id_value11") as String
            bs.text= bundle.get("id_value12") as String

        }



    }
}