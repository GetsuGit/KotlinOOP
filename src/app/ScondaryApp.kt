package app

import data.TanpaScondary

fun main(){

    var data1 = TanpaScondary("Nama A", "Jalan A")
    var data2 = TanpaScondary("Nama B", "Jalan B", "Kota B")

     println(data1.street)
     println(data2.street)
}