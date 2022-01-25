import javax.crypto.AEADBadTagException;
import java.util.Scanner;
public class GunWorking {
    int maxzine;
    int fireRounds;
    int numOfBullets;
    double rangeOfFiring ;
    Scanner gun = new Scanner(System.in);
    int selectedGun = gun.nextInt();
    void guns(){
        System.out.println("AK47");
        System.out.println("UMP9");
    }
    switch (selectedGun) {
        case 1:
            System.out.println("Your selected AK47");
            break;
        case 2:
            System.out.println("Your selected UMP9");
            break;
        default:
            System.out.println("Your selected Pistol");
            break;
    }
    public void maxzineBullets(int loadedBullets){
        maxzine = loadedBullets;
        int reload;
        reload = maxzine;
        System.out.println(reload+" Reloaded the Maxzine the gun");
    }
    public void fireRoundsOfBullets(int fireBullets){
        fireRounds = fireBullets;
        
    }
    public void 
    
}
