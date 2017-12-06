package com.ettle.kotlinmeterialtabs

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var toolbar: Toolbar? = null
    private var btnSimpleTabs: Button? = null
    private var btnScrollableTabs: Button? = null
    private var btnIconTextTabs: Button? = null
    private var btnIconTabs: Button? = null
    private var btnCustomIconTextTabs: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        btnSimpleTabs = findViewById<Button>(R.id.btnSimpleTabs)
        btnScrollableTabs = findViewById<Button>(R.id.btnScrollableTabs)
        btnIconTextTabs = findViewById<Button>(R.id.btnIconTextTabs)
        btnIconTabs = findViewById<Button>(R.id.btnIconTabs)
        btnCustomIconTextTabs = findViewById<Button>(R.id.btnCustomIconTabs)

        btnSimpleTabs!!.setOnClickListener(this)
        btnScrollableTabs!!.setOnClickListener(this)
        btnIconTextTabs!!.setOnClickListener(this)
        btnIconTabs!!.setOnClickListener(this)
        btnCustomIconTextTabs!!.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnSimpleTabs -> startActivity(Intent(this@MainActivity, SimpleTabsActivity::class.java))
            R.id.btnScrollableTabs -> startActivity(Intent(this@MainActivity, ScrollableTabsActivity::class.java))
            R.id.btnIconTextTabs -> startActivity(Intent(this@MainActivity, IconTextTabsActivity::class.java))
            R.id.btnIconTabs -> startActivity(Intent(this@MainActivity, IconTabsActivity::class.java))
            R.id.btnCustomIconTabs -> startActivity(Intent(this@MainActivity, CustomViewIconTextTabsActivity::class.java))
        }
    }
}
