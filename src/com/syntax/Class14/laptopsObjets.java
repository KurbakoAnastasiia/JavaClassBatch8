package com.syntax.Class14;

public class laptopsObjets {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.make = "Mac";
        laptop1.model = "Pro 16";
        laptop1.storage = 1;
        laptop1.RAMCapacity = 16;
        laptop1.color = "pink";
        laptop1.processor = "Core i7";
        laptop1.GPU = "Nvidia RTX 3090 12GB DDR6x";

        laptop1.playMovies();
        laptop1.browseInternet();
        laptop1.makeVideoCall("Trump");
        String model = laptop1.getModel();
        System.out.println(model);
        System.out.println(laptop1.getModel());
        System.out.println(laptop1.getRAMCapacity());
        System.out.println(laptop1.apgratedRam(2));

    }

}
