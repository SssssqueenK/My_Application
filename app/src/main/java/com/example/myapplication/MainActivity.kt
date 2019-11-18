package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val str = "123"
        btn_login.setOnClickListener()
        {
            val str1=et_user_name.text.toString()
            val str2=et_psw.text.toString()
            if(str1.isEmpty()) {
                AlertDialog.Builder(this)
                    .setTitle("温馨提示")
                    .setMessage("用户名为空，请点击确定重新输入")
                    .setPositiveButton("确定") { _, _ ->
                        Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show()
                    }
                    .create().show()
            }
            else if(str2.isEmpty())
            {
                AlertDialog.Builder(this)
                    .setTitle("温馨提示")
                    .setMessage("密码为空，请点击确定重新输入")
                    .setPositiveButton("确定") { _, _ ->
                        Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show()
                    }
                    .create().show()
            }
            else if(!str1.equals(str)||(!str2.equals(str))) {
                AlertDialog.Builder(this)
                    .setTitle("温馨提示")
                    .setMessage("用户名或密码不正确，请点击确定重新输入")
                    .setPositiveButton("确定") { _, _ ->
                        Toast.makeText(this, "请重新输入", Toast.LENGTH_SHORT).show()
                    }
                    .create().show()
            }
            else if(str1.equals(str)&&str2.equals(str))
            {
                startActivity(Intent(this,RecyclerView::class.java))
            }

        }
        btn_register.setOnClickListener()
        {
            startActivity(Intent(this,Register::class.java))
        }

    }

}