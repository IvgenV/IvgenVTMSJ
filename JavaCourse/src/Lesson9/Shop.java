package Lesson9;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Product> products = new ArrayList<>();
    boolean successfully = true;

    public boolean addProduct(Product product){

        if(products.isEmpty()){
            products.add(product);
        }else{
            for(Product prod:products){
                if(prod.id.equals(product.id)){
                    successfully = false;
                    break;
                }else{
                    successfully = true;
                }
            }
            if(successfully){
                products.add(product);
            }
        }

        return successfully;

    }

    public List<Product> receiveAllProducts(){
        return products;
    }

    public boolean deleteProduct(int id){
        successfully = false;
        for(Product product:products){
            if(product.id.equals(id)){
                products.remove(product);
                successfully = true;
                break;
            }
        }
        return successfully;
    }

    public boolean editProcudt(Product product){
        successfully = false;
        for(int i=0;i<products.size();i++){
            if(products.get(i).id.equals(product.id)){
                products.set(i,product);
                successfully = true;
                break;
            }
        }
        return successfully;
    }

}
