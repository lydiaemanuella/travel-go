package com.qreatiq.travelgo.objects

class PackageTour{
    var id : Int? = null
    var title : String? = null
    var price : Int? = null
    var detail : String? = null
    var imageURL : String? = null
    var qty : Int = 0

    constructor(id: Int, title: String, imageURL : String, price : Int, detail : String){
        this.id = id
        this.title = title
        this.imageURL = imageURL
        this.price = price
        this.detail = detail
    }

    override fun toString(): String {
        return "PackageTour(id=$id, title=$title, price=$price, detail=$detail, imageURL=$imageURL)"
    }
}