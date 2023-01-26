
package penjualan;

/**
 *
 * @author NIM 21102082 NAMA SILVESTER ONDIKA MAMPUR
 */
public class harga extends Penjualan {
    private float HG, PD;
    
    public void SetHarga(float nil){
        this.HG = nil;
    }
    public void SetPERSENDISKON(float nil){
        this.PD = nil;
    }
    private float GetHarga(){
        return this.HG;
    }
    private float GetPERSENDISKON(){
        return this.PD;
    }
    public float HitungDISKON(){
        return this.HG * this.PD;
    }

    void SetHarga(harga hg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String HitungHarga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
