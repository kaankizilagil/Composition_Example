
public class Test {
    
    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1028);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        
        Anakart anakart = new Anakart("B250-PRO", "ASUS ", 10, "Windows 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("MacOS Mojave 10.14.13");
    } 
}
