package Inspector;

import softtoys.Bear;
import softtoys.Cow;
import toyvehicles.DefaultCar;
import toyvehicles.RemoteControlCar;
import toyvehicles.RemoteControlHelicopter;
import toyweapons.AK47;
import toyweapons.M16;
import toyweapons.WaterGun;

public class Main {
    public static void main(String[] args) {
        QAInspector qaInspector = new QAInspector();

        Bear bear = new Bear();
        qaInspector.infoSoftToys(bear);

        Cow cow = new Cow();
        qaInspector.infoSoftToys(cow);

        DefaultCar defaultCar = new DefaultCar();
        qaInspector.infoVehiclesToys(defaultCar);

        RemoteControlCar remoteControlCar = new RemoteControlCar();
        qaInspector.infoVehiclesToys(remoteControlCar);

        RemoteControlHelicopter remoteControlHelicopter = new RemoteControlHelicopter();
        qaInspector.infoHelicopterToy(remoteControlHelicopter);

        WaterGun waterGun = new WaterGun();
        qaInspector.infoWeaponToys(waterGun);

        M16 m16 = new M16();
        qaInspector.infoWeaponToys(m16);

        AK47 ak47 = new AK47();
        qaInspector.infoWeaponToys(ak47);
    }
}
