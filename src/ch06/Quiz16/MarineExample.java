package ch06.Quiz16;

import ch06.Quiz16.Marine;

public class MarineExample {
    public static void main(String[] args) {
        Marine marine1 = new Marine();
        marine1.move(100, 200);
        Marine.weaponUp();
        System.out.println("marine1의 공격력: " + Marine.weapon);
        System.out.println("marine1의 방어력: " + Marine.armor);

        Marine marine2 = new Marine();
        marine2.move(100, 200);
        Marine.weaponUp();
        Marine.weaponUp();
        Marine.armorUp();
        System.out.println("marine2의 공격력: " + Marine.weapon);
        System.out.println("marine2의 방어력: " + Marine.armor);


        Marine marine3 = new Marine();
        marine3.move(100, 200);
        Marine.weaponUp();
        Marine.weaponUp();
        Marine.weaponUp();
        System.out.println("marine3의 공격력: " + Marine.weapon);
        System.out.println("marine3의 방어력: " + Marine.armor);



    }
}