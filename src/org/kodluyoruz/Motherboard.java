package org.kodluyoruz;

/**
 * Bu sınıf bir anakartı temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her anakartın Hardware sınıfındakilere ek olarak 3 özelliği vardır:
 *      - İşlemci mimarisi, yani hangi marka işlemcilere uygun olduğu (cpuArchitect) (String türünde) Örnek: AMD veya Intel
 *      - WiFi olup olmadığı (wifiIncluded) (boolean türünde)
 *      - Bluetooth olup olmadığı (bluetoothIncluded) (boolean türünde)
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class Motherboard extends Hardware
{
    private String cpuArchitect;
    private Boolean wifiIncluded=false;
    private Boolean bluetoothIncluded=false;

    /*
     * Eğer anakartın üzerinde WiFi chipset'i varsa anakartın fiyatı 250 TL artar.
     * Eğer anakartın üzerinde bluetooth chipset'i varsa anakartın fiyatı 100 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public void setPrice(double price) {

        if(wifiIncluded){
            price += 250d;
        }

        if(bluetoothIncluded){
            price += 100d;
        }

        this.price=price;
    }

    @Override
    public double getPrice() {
        setPrice(this.price);
        return this.price;
    }

    public String getCpuArchitect() {
        return cpuArchitect;
    }

    public void setCpuArchitect(String cpuArchitect) {
        this.cpuArchitect = cpuArchitect;
    }

    public Boolean getWifiIncluded() {
        return wifiIncluded;
    }

    public void setWifiIncluded(Boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public Boolean getBluetoothIncluded() {
        return bluetoothIncluded;
    }

    public void setBluetoothIncluded(Boolean bluetoothIncluded) {
        this.bluetoothIncluded = bluetoothIncluded;
    }
}
