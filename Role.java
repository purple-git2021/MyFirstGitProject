package com;

public class Role {
   IAttackStrategy  weapon;
   String name;
   
   public Role(String na,IAttackStrategy  wp){
	   weapon=wp;
	   name=na;
   }
   public IAttackStrategy getWeapon() {
	return weapon;
   }
	public void setWeapon(IAttackStrategy weapon) {
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	void attack(Monster ms){
		weapon.attackTarget(ms);
	}
   
}
