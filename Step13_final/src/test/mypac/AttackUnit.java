package test.mypac;

public class AttackUnit {
	// ���ڸ� ���ȭ ��Ű��
	public static final int FIST = 0;
	public static final int SWORD = 1;
	public static final int GUN = 2;
	
	private int weaponState = 0;
	
	public void setWeaponState(int weaponState) {
		this.weaponState = weaponState;
	}
	
	//�����ϴ� �޼ҵ�
	public void attack() {
		if(weaponState == FIST) {
			System.out.println("�ָ����� �����ؿ�!");
		}else if(weaponState == SWORD) {
			System.out.println("Į�� �����ؿ�!");
		}else if(weaponState == GUN) {
			System.out.println("������ �����ؿ�!");
		}
	}
}
