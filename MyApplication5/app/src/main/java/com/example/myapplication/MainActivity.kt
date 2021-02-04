package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerView.widget.LinearLayoutManager
import androidx.recyclerView.widget.RecyclerView

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(private val products: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView: ImageView=itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        val p = products[position]

        val url: String =p.photo

        Glide.with(holder.imageView.context).load(url).centerCrop().into(holder.imageView)
    }

    override fun getItemCount(): Int=products.size



}

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.resiclerView)

        val productList= ArrayList<Product>()
        productList.add(Product("https://www.jackiecoopermini.com/assets/stock/expanded/white/640/2015meb001i_640/2015meb001i_640_11.jpg?height=400"))
        productList.add(Product("https://www.carscoops.com/wp-content/uploads/2014/01/Mercedes-Benz-Class-2015-1.jpg"))
        productList.add(Product("https://www.wheelspecialists.com/gallery/VehicleImage/3934/3934_xlarge.jpg"))
        productList.add(Product("https://di-uploads-pod6.dealerinspire.com/raycatenaedison/uploads/2015/03/2015-C-CLASS-SEDAN-GALLERY-038-GOE-D.jpg"))
        productList.add(Product("https://bidfax.info/uploads/posts/2018-12/19/mercedes-benz-c-300-2015-55swf4jb4fu044771-img1.jpg"))
        productList.add(Product("https://thumbs.dreamstime.com/z/mercedes-benz-taxi-highway-germany-frankfurt-july-w-station-wagon-moving-fast-near-frankfurt-july-frankfurt-main-57226756.jpg"))
        productList.add(Product("https://i.pinimg.com/originals/ed/fb/50/edfb50b6102bcb70493a4bdde5cc8fff.jpg"))
        productList.add(Product("https://www.pewpewtactical.com/wp-content/uploads/2017/05/Beretta-92FS-in-the-wild-1024x516.jpg"))

        productList.add(Product("https://www.jackiecoopermini.com/assets/stock/expanded/white/640/2015meb001i_640/2015meb001i_640_11.jpg?height=400"))
        productList.add(Product("https://www.carscoops.com/wp-content/uploads/2014/01/Mercedes-Benz-Class-2015-1.jpg"))
        productList.add(Product("https://www.wheelspecialists.com/gallery/VehicleImage/3934/3934_xlarge.jpg"))
        productList.add(Product("https://di-uploads-pod6.dealerinspire.com/raycatenaedison/uploads/2015/03/2015-C-CLASS-SEDAN-GALLERY-038-GOE-D.jpg"))
        productList.add(Product("https://bidfax.info/uploads/posts/2018-12/19/mercedes-benz-c-300-2015-55swf4jb4fu044771-img1.jpg"))
        productList.add(Product("https://thumbs.dreamstime.com/z/mercedes-benz-taxi-highway-germany-frankfurt-july-w-station-wagon-moving-fast-near-frankfurt-july-frankfurt-main-57226756.jpg"))
        productList.add(Product("https://i.pinimg.com/originals/ed/fb/50/edfb50b6102bcb70493a4bdde5cc8fff.jpg"))
        productList.add(Product("https://www.pewpewtactical.com/wp-content/uploads/2017/05/Beretta-92FS-in-the-wild-1024x516.jpg"))

        productList.add(Product("https://www.jackiecoopermini.com/assets/stock/expanded/white/640/2015meb001i_640/2015meb001i_640_11.jpg?height=400"))
        productList.add(Product("https://www.carscoops.com/wp-content/uploads/2014/01/Mercedes-Benz-Class-2015-1.jpg"))
        productList.add(Product("https://www.wheelspecialists.com/gallery/VehicleImage/3934/3934_xlarge.jpg"))
        productList.add(Product("https://di-uploads-pod6.dealerinspire.com/raycatenaedison/uploads/2015/03/2015-C-CLASS-SEDAN-GALLERY-038-GOE-D.jpg"))
        productList.add(Product("https://bidfax.info/uploads/posts/2018-12/19/mercedes-benz-c-300-2015-55swf4jb4fu044771-img1.jpg"))
        productList.add(Product("https://thumbs.dreamstime.com/z/mercedes-benz-taxi-highway-germany-frankfurt-july-w-station-wagon-moving-fast-near-frankfurt-july-frankfurt-main-57226756.jpg"))
        productList.add(Product("https://i.pinimg.com/originals/ed/fb/50/edfb50b6102bcb70493a4bdde5cc8fff.jpg"))
        productList.add(Product("https://www.pewpewtactical.com/wp-content/uploads/2017/05/Beretta-92FS-in-the-wild-1024x516.jpg"))

        val productAdapter=ProductAdapter(productList)


        recyclerView.adapter=productAdapter

    }
}

class Product(s: String) {
    data class Product(
        val photo: String,


        )

}
