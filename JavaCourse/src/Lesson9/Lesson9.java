package Lesson9;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Lesson9 {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        try {
            i = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(i);

    }

    public static void busSchedule(){

        String[] bus;
        List<BusSchedule> busSchedule = new ArrayList<>();
        List<BusSchedule> finalBus = new ArrayList<>();


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("bus.txt"))){
            String line;
            while ((line = bufferedReader.readLine())!=null){
                bus = line.split(" ");
                BusSchedule busSched = new BusSchedule(bus);
                busSchedule.add(busSched);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        busSchedule.sort(new Comparator2().thenComparing(new Comparator1()));

        for(BusSchedule bu:busSchedule){

            System.out.println(bu.getCompanyName() + " " + bu.getDepartureTime() + " " + bu.getArrivalTime());
        }


       /* for (int i=0;i<busSchedule.size();i++){
            if(busSchedule.get(i).departureTime.equals(busSchedule.get(i + 1).departureTime)&
                    busSchedule.get(i).ArrivalTime.equals(busSchedule.get(i+1).ArrivalTime)){
                if(busSchedule.get(i).companyName.equals("Posh")){
                    finalBus.add(busSchedule.get(i));
                }else if(busSchedule.get(i+1).companyName.equals("Posh")){
                    finalBus.add(busSchedule.get(i+1));
                }
            }else if(){

            }
        }
*/



        //// 1 - если прибытие и отбытие одно и тоже, то в приоритете Posh
        /// 2 - если если стартует позже

    }

    public static void shop(){

        boolean continueMainSwitch = true;
        boolean MainSwitchCase1;
        boolean MainSwitchCase2;
        boolean MainSwitchCase3;
        boolean MainSwitchCase4;
        boolean success;
        Shop shop = new Shop();
        Product pr0 = new Product(1,570,"Redmi note 8 pro");
        Product pr1 = new Product(2,630,"Samsung Galaxy A51");
        Product pr2 = new Product(3,999,"Honor 30");
        Product pr3 = new Product(4,660,"Samsung Galaxy M31");
        shop.addProduct(pr0);
        shop.addProduct(pr1);
        shop.addProduct(pr2);
        shop.addProduct(pr3);
        int input;
        int id;
        int price;
        String name;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Input: 1 - output all products, 2 - add product, 3 - delete product " +
                    "by id, 4 - editing product, 5 - exit");
            input = scanner.nextInt();


            switch (input){

                case 1:{

                    do {

                        System.out.println("Input sort method: 1 - coast increase, 2 - coast decrease ;" +
                                "3 - by order, 4 - exit");
                        input = scanner.nextInt();
                        MainSwitchCase1 = true;

                        switch (input){

                            case 1:{
                                List<Product> products = shop.receiveAllProducts();
                                products.sort(new Comparator<Product>() {
                                    @Override
                                    public int compare(Product o1, Product o2) {
                                        return o1.price.compareTo(o2.price);
                                    }
                                });
                                for (Product product:products){
                                    System.out.println(product.toString());
                                }
                                MainSwitchCase1 = false;
                                break;
                            }

                            case 2:{
                                List<Product> products = shop.receiveAllProducts();
                                products.sort(new Comparator<Product>() {
                                    @Override
                                    public int compare(Product o1, Product o2) {
                                        return o1.price.compareTo(o2.price);
                                    }
                                });
                                Collections.reverse(products);
                                for (Product product:products){
                                    System.out.println(product.toString());
                                }
                                MainSwitchCase1 = false;
                                break;
                            }

                            case 3:{
                                List<Product> products = shop.receiveAllProducts();
                                Collections.reverse(products);
                                for(Product product:products){
                                    System.out.println(product.toString());
                                }
                                MainSwitchCase1 = false;
                                break;
                            }

                            case 4:{
                                MainSwitchCase1 = false;
                                break;
                            }

                            default:{
                                System.out.println("Input wrong number!");
                            }
                        }

                    }while (MainSwitchCase1);

                    break;
                }

                case 2:{

                    do{
                        MainSwitchCase2 = true;
                        System.out.println("Add product - 1, exit = 2");
                        input = scanner.nextInt();
                        if(input == 1){

                            System.out.println("Input: id");
                            id = scanner.nextInt();
                            System.out.println("Input: price");
                            price = scanner.nextInt();
                            System.out.println("Input: name");
                            name = scanner.next();

                            Product product = new Product(id,price,name);
                            success = shop.addProduct(product);

                            if(success){
                                System.out.println("Product successfully added!");
                            }else {
                                System.out.println("Your product have id that the product on the list.");
                            }
                            MainSwitchCase2 = false;
                        }else if(input == 2){
                            MainSwitchCase2 = false;
                        } else{
                            System.out.println("Input wrong number!");
                        }

                    }while (MainSwitchCase2);

                    break;
                }

                case 3:{

                    do {

                        MainSwitchCase3 = true;
                        System.out.println("Delete product by id - 1, exit - 2;");
                        input = scanner.nextInt();

                        if(input == 1){

                            System.out.println("Input id to delete:");
                            id = scanner.nextInt();
                            success = shop.deleteProduct(id);

                            if(success){
                                System.out.println("Product id:" + id + " successfully deleted!");
                                MainSwitchCase3 = false;
                            }else{
                                System.out.println("There are no product with this id!");
                                MainSwitchCase3 = false;
                            }

                        }else if(input == 2){
                            MainSwitchCase3 = false;
                        } else System.out.println("Input wrong number!");

                    }while (MainSwitchCase3);

                    break;

                }

                case 4:{

                    do {
                        MainSwitchCase4 = true;
                        System.out.println("Edit product by id - 1, exit - 2 ");
                        input = scanner.nextInt();

                        if(input == 1){
                            System.out.println("Input id");
                            id = scanner.nextInt();
                            System.out.println("Input price");
                            price = scanner.nextInt();
                            System.out.println("Input name");
                            name = scanner.next();

                            Product product = new Product(id,price,name);
                            success = shop.editProcudt(product);

                            if(success){
                                System.out.println("Sucs");
                                MainSwitchCase4 = false;
                            }else{
                                System.out.println("Fuck!!!!");
                                MainSwitchCase4 = false;
                            }
                        } else if(input == 2){
                            MainSwitchCase4 = false;
                        } else System.out.println("Input wrong number!");

                    }while (MainSwitchCase4);

                    break;

                }

                case 5:{
                    continueMainSwitch = false;
                    for(Product product: shop.receiveAllProducts()){
                        System.out.println(product.toString());
                    }
                    break;
                }

            }

        }while (continueMainSwitch);

    }

}
