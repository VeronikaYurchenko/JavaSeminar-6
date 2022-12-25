package job;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Создание объектов класса Laptop
        Laptop HUAWEI_MATEBook = new Laptop("HUAWEI_MATEBook", 16, "4k",
                true, 512, "16", "Windows", "grey");
        Brand brandHp = new Brand("HUAWEI", "China", "ChineseLanguage");
        HUAWEI_MATEBook.addBrand(brandHp);
        Laptop hp_galaxy_x64 = new Laptop("hp_galaxy_x64", 14, "FullHD",
                true, 512, "8", "Windows", "white");
        hp_galaxy_x64.addBrand(brandHp);
        Laptop Samsung_a52 = new Laptop("samsung_a52", 18, "FullHD",
                true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        Samsung_a52.addBrand(brandSamsung);
        Laptop MSI= new Laptop("MSI", 17, "4k",
                false, 1000, "16", "Linux", "black");
        MSI.addBrand(brandSamsung);
        Laptop lenovo_gtx76 = new Laptop("lenovo_gtx76", 16, "FullHD",
                true, 700, "8", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        Laptop macbook_14pro = new Laptop("macbook_14pro", 17, "4k",
                false, 1000, "8", "ios", "white");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        Laptop asus_x515 = new Laptop("asus_x515", 17, "FullHD",
                true, 300, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "taiwan", "ChinaLanguage");
        asus_x515.addBrand(brandAsus);
        Laptop acer_air5 = new Laptop("acer_air5", 19, "FullHD",
                true, 600, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);
        Laptop acer_air6 = new Laptop("acer_air6" ,18, "4k",
                false, 512, "16", "Windows", "black");
        acer_air6.addBrand(brandAcer);
        Laptop GIGABYTE = new Laptop("GIGABYTE", 16, "FullHD",
                true, 512, "8", "Windows", "black");
       GIGABYTE.addBrand(brandAcer);
// Создание множества
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(HUAWEI_MATEBook);
        laptop.add(hp_galaxy_x64);
        laptop.add(Samsung_a52);
        laptop.add(MSI);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(GIGABYTE);
// создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}